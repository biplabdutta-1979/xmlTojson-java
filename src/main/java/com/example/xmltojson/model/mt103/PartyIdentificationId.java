package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyIdentificationId {
    @JsonProperty("OrgId")
    private OrganisationIdentification organisationId;
    
    @JsonProperty("PrvtId")
    private PersonIdentification privateId;

    public OrganisationIdentification getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(OrganisationIdentification organisationId) {
        this.organisationId = organisationId;
    }

    public PersonIdentification getPrivateId() {
        return privateId;
    }

    public void setPrivateId(PersonIdentification privateId) {
        this.privateId = privateId;
    }
}
