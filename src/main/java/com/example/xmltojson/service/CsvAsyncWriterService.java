package com.example.xmltojson.service;

import com.example.xmltojson.model.TransformationResult;
import com.opencsv.CSVWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;

@Service
public class CsvAsyncWriterService {
    private static final Logger logger = LoggerFactory.getLogger(CsvAsyncWriterService.class);
    @Value("${csv.output.path}")
    private String csvFilePath;
    private boolean isFirstWrite = true;
    private CSVWriter writer;
    private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    public void openResultOutputFile(String fileName) {
        try {
            // csvFilePath is used as a directory
            java.io.File dir = new java.io.File(csvFilePath);
            if (!dir.exists()) {
                logger.info("Creating directory: {}", dir.getAbsolutePath());
                if (!dir.mkdirs()) {
                    String errorMsg = "Failed to create directory: " + dir.getAbsolutePath();
                    logger.error(errorMsg);
                    throw new IOException(errorMsg);
                }
            }
            String fullPath = new java.io.File(dir, fileName).getAbsolutePath();
            lock.lock();
            try {
                if (writer != null) {
                    closeResultOutputFile();
                }
                // Check if file exists to determine if we need to write header
                boolean fileExists = new java.io.File(fullPath).exists();
                writer = new CSVWriter(new FileWriter(fullPath, true));
                // Write header if file is new
                if (!fileExists) {
                    String[] header = {"File Name", "Start Time", "End Time", "Duration (ms)", "File Size (bytes)"};
                    writer.writeNext(header);
                    writer.flush();
                }
                isFirstWrite = false;
            } finally {
                lock.unlock();
            }
        } catch (IOException e) {
            logger.error("Failed to open CSV file for writing", e);
            throw new RuntimeException("Failed to open CSV file for writing", e);
        }
    }

    public void closeResultOutputFile() {
        lock.lock();
        try {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    logger.error("Error closing CSV writer", e);
                }
                writer = null;
            }
        } finally {
            lock.unlock();
        }
    }

    private void ensureFileOpen() {
        if (writer == null) {
            openResultOutputFile("transformation_results.csv");
            // Write header if it's the first time opening the file
            if (isFirstWrite) {
                String[] header = {"File Name", "Start Time", "End Time", "Duration (ms)", "File Size (bytes)"};
                writer.writeNext(header);
                isFirstWrite = false;
                try {
                    writer.flush();
                } catch (IOException e) {
                    logger.error("Error flushing CSV writer after writing header", e);
                }
            }
        }
    }

    @Async
    public void writeResultsToCsv(List<TransformationResult> results) {
        if (results == null || results.isEmpty()) {
            logger.debug("No results to write to CSV");
            return;
        }
        
        ensureFileOpen();
        lock.lock();
        try {
            for (TransformationResult result : results) {
                try {
                    String[] record = new String[] {
                            result.getFileName(),
                            result.getStartTime().toString(),
                            result.getEndTime().toString(),
                            String.valueOf(result.getTotalTimeTakenMs()),
                            String.valueOf(result.getFileSizeBytes())
                    };
                    try {
                        writer.writeNext(record);
                        //logger.debug("Successfully wrote result to CSV for file: {}", result.getFileName());
                    } catch (Exception e) {
                        logger.error("Failed to write record to CSV for file: {}", result.getFileName(), e);
                        // Attempt to reopen the file on write error
                        try {
                            closeResultOutputFile();
                            openResultOutputFile("transformation_results.csv");
                            writer.writeNext(record);
                            logger.info("Recovered from write error and successfully wrote record for: {}", result.getFileName());
                        } catch (Exception ex) {
                            logger.error("Failed to recover from write error for file: {}", result.getFileName(), ex);
                            throw ex;
                        }
                    }
                } catch (Exception e) {
                    logger.error("Error writing result to CSV for file: " + result.getFileName(), e);
                    throw e;
                }
            }
            try {
                writer.flush();
            } catch (IOException e) {
                logger.error("Error flushing CSV writer", e);
            }
        } finally {
            lock.unlock();
        }
    }

    @javax.annotation.PreDestroy
    public void closeWriter() {
        lock.lock();
        try {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                writer = null;
            }
        } finally {
            lock.unlock();
        }
    }
}
