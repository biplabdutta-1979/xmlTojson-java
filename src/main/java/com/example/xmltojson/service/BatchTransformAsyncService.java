package com.example.xmltojson.service;

import com.example.xmltojson.model.TransformationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.xmltojson.service.Pain001ToMt103TranslatorService;
import com.example.xmltojson.service.CsvAsyncWriterService;

@Service
public class BatchTransformAsyncService {
    private static final Logger logger = LoggerFactory.getLogger(BatchTransformAsyncService.class);
    
    private final Pain001ToMt103TranslatorService translatorService;
    private final CsvAsyncWriterService csvWriterService;
    private final Executor transformationExecutor;
    private final Executor csvWriterExecutor;
    private final String inputDirectoryPath;

    @Autowired
    public BatchTransformAsyncService(
            Pain001ToMt103TranslatorService translatorService,
            CsvAsyncWriterService csvWriterService,
            @Qualifier("transformationTaskExecutor") Executor transformationExecutor,
            @Qualifier("csvWriterTaskExecutor") Executor csvWriterExecutor,
            @org.springframework.beans.factory.annotation.Value("${input.directory.path}") String inputDirectoryPath) {
        this.translatorService = translatorService;
        this.csvWriterService = csvWriterService;
        this.transformationExecutor = transformationExecutor;
        this.csvWriterExecutor = csvWriterExecutor;
        this.inputDirectoryPath = inputDirectoryPath;
    }


    /**
     * Process batch files synchronously and return the results
     * @param count Number of files to process
     * @return List of transformation results
     * @throws IOException If there's an error reading files
     */
    public List<TransformationResult> processBatchSynchronously(int count, String folderName) throws IOException {
        List<TransformationResult> results = new ArrayList<>();
        
        // Construct the full input path
        String fullInputPath = inputDirectoryPath;
        if (folderName != null && !folderName.trim().isEmpty()) {
            fullInputPath = inputDirectoryPath.endsWith("/") 
                ? inputDirectoryPath + folderName
                : inputDirectoryPath + "/" + folderName;
            
            // Ensure the directory exists
            File dir = new File(fullInputPath);
            if (!dir.exists() || !dir.isDirectory()) {
                throw new IOException("Input directory does not exist: " + fullInputPath);
            }
        }
        
        File sampleDir = new File(fullInputPath);
        File[] xmlFiles = sampleDir.listFiles((dir, name) -> name.endsWith(".xml"));
        
        if (xmlFiles == null || xmlFiles.length == 0) {
            throw new IOException("No XML files found in input directory: " + inputDirectoryPath);
        }
        
        int filesToProcess = Math.min(count, xmlFiles.length);
        for (int i = 0; i < filesToProcess; i++) {
            File xmlFile = xmlFiles[i];
            try {
                String xmlContent = Files.readString(xmlFile.toPath());
                Instant start = Instant.now();
                String mt103Json = translatorService.translatePain001XmlToMt103Json(xmlContent);
                Instant end = Instant.now();
                long duration = end.toEpochMilli() - start.toEpochMilli();
                
                TransformationResult result = new TransformationResult(
                    xmlFile.getName(), 
                    mt103Json, 
                    start, 
                    end, 
                    duration, 
                    xmlFile.length()
                );
                results.add(result);
            } catch (Exception e) {
                System.err.println("Error processing file: " + xmlFile.getName());
                e.printStackTrace();
            }
        }
        return results;
    }
    
    /**
     * Process a batch of XML files asynchronously
     * @param count Number of files to process
     * @param folderName Optional subfolder name under the base input directory
     * @throws IOException If there's an error reading files
     */
    private static final int BATCH_SIZE = 1000; // Process files in batches of 1000
    
    @Async
    public void processBatch(int count, String folderName) throws IOException {
        // Construct the full input path
        String fullInputPath = inputDirectoryPath;
        if (folderName != null && !folderName.trim().isEmpty()) {
            fullInputPath = inputDirectoryPath.endsWith("/") 
                ? inputDirectoryPath + folderName
                : inputDirectoryPath + "/" + folderName;
            
            // Check if the directory exists
            File dir = new File(fullInputPath);
            if (!dir.exists() || !dir.isDirectory()) {
                throw new IOException("Directory does not exist: " + fullInputPath);
            }
        }
        
        // Get list of XML files
        File[] files = new File(fullInputPath).listFiles((dir, name) -> name.endsWith(".xml"));
        if (files == null || files.length == 0) {
            logger.warn("No XML files found in directory: {}", fullInputPath);
            return;
        }
        
        // Limit to the requested count
        File[] filesToProcess = files.length > count 
            ? java.util.Arrays.copyOf(files, count) 
            : files;
            
        int totalFiles = filesToProcess.length;
        int processedFiles = 0;
        
        // Process files in batches
        for (int i = 0; i < totalFiles; i += BATCH_SIZE) {
            int endIndex = Math.min(i + BATCH_SIZE, totalFiles);
            File[] batch = java.util.Arrays.copyOfRange(filesToProcess, i, endIndex);
            
            logger.info("Processing batch {}-{}/{}", i + 1, endIndex, totalFiles);
            
            List<CompletableFuture<TransformationResult>> batchFutures = new ArrayList<>();
            
            // Process each file in the current batch
            for (File xmlFile : batch) {
                CompletableFuture<TransformationResult> future = processSingleFile(xmlFile);
                batchFutures.add(future);
            }
            
            // Wait for current batch to complete before starting next batch
            try {
                CompletableFuture.allOf(batchFutures.toArray(new CompletableFuture[0])).join();
                processedFiles += batch.length;
                logger.info("Completed batch: {}/{} files processed", processedFiles, totalFiles);
            } catch (Exception e) {
                logger.error("Error processing batch {}-{}", i + 1, endIndex, e);
                // Continue with next batch even if one fails
            }
        }
        
        logger.info("Completed processing {} files", totalFiles);
    }
    
    private CompletableFuture<TransformationResult> processSingleFile(File xmlFile) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                String xmlContent = Files.readString(xmlFile.toPath());
                Instant start = Instant.now();
                String mt103Json = translatorService.translatePain001XmlToMt103Json(xmlContent);
                logger.info(mt103Json);
                Instant end = Instant.now();
                
                TransformationResult result = new TransformationResult(
                    xmlFile.getName(), 
                    mt103Json, 
                    start, 
                    end, 
                    end.toEpochMilli() - start.toEpochMilli(), 
                    xmlFile.length()
                );
                
                logger.debug("Successfully translated file: {}", xmlFile.getName());
                return result;
            } catch (Exception e) {
                logger.error("Error processing file: {}", xmlFile.getName(), e);
                return new TransformationResult(
                    xmlFile.getName(), 
                    "Error: " + e.getMessage(), 
                    Instant.now(), 
                    Instant.now(), 
                    0, 
                    xmlFile.length()
                );
            }
        }, transformationExecutor)
        .thenApplyAsync(result -> {
            csvWriterService.writeResultsToCsv(java.util.Collections.singletonList(result));
            return result;
        }, csvWriterExecutor);
    }
}
