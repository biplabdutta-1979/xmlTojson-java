package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party38Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party38Choice {
    @XmlElement(name = "OrgId")
    protected OrganisationIdentification29 orgId;
    
    @XmlElement(name = "PrvtId")
    protected PersonIdentification13 prvtId;

    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    public void setOrgId(OrganisationIdentification29 value) {
        this.orgId = value;
    }

    public PersonIdentification13 getPrvtId() {
        return prvtId;
    }

    public void setPrvtId(PersonIdentification13 value) {
        this.prvtId = value;
    }
}
