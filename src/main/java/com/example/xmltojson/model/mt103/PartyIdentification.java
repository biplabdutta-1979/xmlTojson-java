package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyIdentification {
    @JsonProperty("Nm")
    private String name;
    
    @JsonProperty("Id")
    private PartyIdentificationId id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartyIdentificationId getId() {
        return id;
    }

    public void setId(PartyIdentificationId id) {
        this.id = id;
    }
}
