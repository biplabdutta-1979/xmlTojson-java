package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericAccountIdentification {
    @JsonProperty("Id")
    private String id;
    
    @JsonProperty("SchmeNm")
    private AccountSchemeName schemeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountSchemeName getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(AccountSchemeName schemeName) {
        this.schemeName = schemeName;
    }
}
