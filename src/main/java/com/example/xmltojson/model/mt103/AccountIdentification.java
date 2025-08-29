package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountIdentification {
    @JsonProperty("IBAN")
    private String iban;
    
    @JsonProperty("Othr")
    private GenericAccountIdentification other;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public GenericAccountIdentification getOther() {
        return other;
    }

    public void setOther(GenericAccountIdentification other) {
        this.other = other;
    }
}
