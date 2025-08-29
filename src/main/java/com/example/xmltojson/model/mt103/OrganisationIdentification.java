package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganisationIdentification {
    @JsonProperty("BICFI")
    private String bicfi;
    
    @JsonProperty("Othr")
    private GenericOrganisationIdentification other;

    public String getBicfi() {
        return bicfi;
    }

    public void setBicfi(String bicfi) {
        this.bicfi = bicfi;
    }

    public GenericOrganisationIdentification getOther() {
        return other;
    }

    public void setOther(GenericOrganisationIdentification other) {
        this.other = other;
    }
}
