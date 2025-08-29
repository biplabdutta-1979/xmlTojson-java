package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericPersonIdentification {
    @JsonProperty("Id")
    private String id;
    
    @JsonProperty("SchmeNm")
    private PersonIdentificationSchemeName schemeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonIdentificationSchemeName getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(PersonIdentificationSchemeName schemeName) {
        this.schemeName = schemeName;
    }
}
