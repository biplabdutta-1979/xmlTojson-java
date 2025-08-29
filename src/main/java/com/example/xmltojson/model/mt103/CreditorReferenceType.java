package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditorReferenceType {
    @JsonProperty("CdOrPrtry")
    private String codeOrProprietary;
    
    @JsonProperty("Issr")
    private String issuer;

    public String getCodeOrProprietary() {
        return codeOrProprietary;
    }

    public void setCodeOrProprietary(String codeOrProprietary) {
        this.codeOrProprietary = codeOrProprietary;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
