package com.example.xmltojson.controller;

import com.example.xmltojson.model.TransformationResult;
import com.example.xmltojson.service.CsvAsyncWriterService;
import com.example.xmltojson.service.Pain001ToMt103TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/transform")
public class TransformationController {
    @Autowired
    private Pain001ToMt103TranslatorService translatorService;
    @Autowired
    private CsvAsyncWriterService csvWriterService;
    @Autowired
    private com.example.xmltojson.service.BatchTransformAsyncService batchTransformAsyncService;

    @PostMapping("/single")
    public ResponseEntity<TransformationResult> transformSingle(@RequestBody String pain001Xml) throws Exception {
        Instant start = Instant.now();
        String mt103Json = translatorService.translatePain001XmlToMt103Json(pain001Xml);
        Instant end = Instant.now();
        long duration = end.toEpochMilli() - start.toEpochMilli();
        TransformationResult result = new TransformationResult(null, mt103Json, start, end, duration, pain001Xml.length());
        System.out.println(mt103Json);
        // Async write to CSV
        List<TransformationResult> results = new ArrayList<>();
        results.add(result);
        csvWriterService.writeResultsToCsv(results);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/batch/{folderName}/{count}")
    public ResponseEntity<String> transformBatch(
            @PathVariable("count") int count,
            @PathVariable(value = "folderName", required = false) String folderName) {
        try {
            // Process batch asynchronously with the specified folder
            batchTransformAsyncService.processBatch(count, folderName);
            return ResponseEntity.ok("Started processing " + count + " files from folder: " + 
                                 (folderName != null ? folderName : "default") + ". Results will be written to CSV.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error during batch processing: " + e.getMessage());
        }
    }

    @GetMapping("/openresultfile/{fileName}")
    public ResponseEntity<String> openOutputFile(@PathVariable("fileName") String fileName) {
        csvWriterService.openResultOutputFile(fileName);
        return ResponseEntity.ok("Output file opened: " + fileName);
    }

    @GetMapping("/closeresultfile")
    public ResponseEntity<String> closeOutputFile() {
        csvWriterService.closeResultOutputFile();
        return ResponseEntity.ok("Output file closed.");
    }
}
