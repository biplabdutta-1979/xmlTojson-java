package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemittanceInformation {
    @JsonProperty("Ustrd")
    private String unstructured;
    
    @JsonProperty("Strd")
    private StructuredRemittanceInformation structured;

    public String getUnstructured() {
        return unstructured;
    }

    public void setUnstructured(String unstructured) {
        this.unstructured = unstructured;
    }

    public StructuredRemittanceInformation getStructured() {
        return structured;
    }

    public void setStructured(StructuredRemittanceInformation structured) {
        this.structured = structured;
    }
}
