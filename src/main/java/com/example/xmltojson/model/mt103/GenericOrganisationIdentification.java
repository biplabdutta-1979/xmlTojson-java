package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericOrganisationIdentification {
    @JsonProperty("Id")
    private String id;
    
    @JsonProperty("SchmeNm")
    private OrganisationIdentificationSchemeName schemeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganisationIdentificationSchemeName getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(OrganisationIdentificationSchemeName schemeName) {
        this.schemeName = schemeName;
    }
}
