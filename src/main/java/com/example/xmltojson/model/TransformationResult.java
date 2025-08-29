package com.example.xmltojson.model;

import java.time.Instant;

public class TransformationResult {
    private String fileName;
    private String mt103Json;
    private Instant startTime;
    private Instant endTime;
    private long totalTimeTakenMs;
    private long fileSizeBytes;

    public TransformationResult() {}

    public TransformationResult(String fileName, String mt103Json, Instant startTime, Instant endTime, long totalTimeTakenMs, long fileSizeBytes) {
        this.fileName = fileName;
        this.mt103Json = mt103Json;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalTimeTakenMs = totalTimeTakenMs;
        this.fileSizeBytes = fileSizeBytes;
    }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getMt103Json() { return mt103Json; }
    public void setMt103Json(String mt103Json) { this.mt103Json = mt103Json; }

    public Instant getStartTime() { return startTime; }
    public void setStartTime(Instant startTime) { this.startTime = startTime; }

    public Instant getEndTime() { return endTime; }
    public void setEndTime(Instant endTime) { this.endTime = endTime; }

    public long getTotalTimeTakenMs() { return totalTimeTakenMs; }
    public void setTotalTimeTakenMs(long totalTimeTakenMs) { this.totalTimeTakenMs = totalTimeTakenMs; }

    public long getFileSizeBytes() { return fileSizeBytes; }
    public void setFileSizeBytes(long fileSizeBytes) { this.fileSizeBytes = fileSizeBytes; }
}
