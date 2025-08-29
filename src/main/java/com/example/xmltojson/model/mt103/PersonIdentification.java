package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonIdentification {
    @JsonProperty("Othr")
    private GenericPersonIdentification other;

    public GenericPersonIdentification getOther() {
        return other;
    }

    public void setOther(GenericPersonIdentification other) {
        this.other = other;
    }
}
