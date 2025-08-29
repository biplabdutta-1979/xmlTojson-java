package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StructuredRemittanceInformation {
    @JsonProperty("CdtrRefInf")
    private CreditorReferenceInformation creditorReferenceInformation;
    
    @JsonProperty("AddtlRmtInf")
    private String additionalRemittanceInformation;

    public CreditorReferenceInformation getCreditorReferenceInformation() {
        return creditorReferenceInformation;
    }

    public void setCreditorReferenceInformation(CreditorReferenceInformation creditorReferenceInformation) {
        this.creditorReferenceInformation = creditorReferenceInformation;
    }

    public String getAdditionalRemittanceInformation() {
        return additionalRemittanceInformation;
    }

    public void setAdditionalRemittanceInformation(String additionalRemittanceInformation) {
        this.additionalRemittanceInformation = additionalRemittanceInformation;
    }
}
