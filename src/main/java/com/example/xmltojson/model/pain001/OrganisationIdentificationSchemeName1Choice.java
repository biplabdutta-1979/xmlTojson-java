package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentificationSchemeName1Choice", propOrder = {
    "cd",
    "prtry"
})
public class OrganisationIdentificationSchemeName1Choice {
    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected ExternalOrganisationIdentification1Code cd;
    
    @XmlElement(name = "Prtry")
    protected String prtry;

    public ExternalOrganisationIdentification1Code getCd() {
        return cd;
    }

    public void setCd(ExternalOrganisationIdentification1Code value) {
        this.cd = value;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String value) {
        this.prtry = value;
    }
}
