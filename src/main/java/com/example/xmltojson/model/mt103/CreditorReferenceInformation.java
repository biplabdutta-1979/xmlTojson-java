package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditorReferenceInformation {
    @JsonProperty("Tp")
    private CreditorReferenceType type;
    
    @JsonProperty("Ref")
    private String reference;

    public CreditorReferenceType getType() {
        return type;
    }

    public void setType(CreditorReferenceType type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
