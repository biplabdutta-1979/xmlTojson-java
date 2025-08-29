package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification", propOrder = {
    "bicOrBei",
    "othr"
})
public class OrganisationIdentification {
    @XmlElement(name = "BICOrBEI")
    protected String bicOrBei;
    
    @XmlElement(name = "Othr")
    protected GenericOrganisationIdentification othr;

    public String getBicOrBei() {
        return bicOrBei;
    }

    public void setBicOrBei(String value) {
        this.bicOrBei = value;
    }

    public GenericOrganisationIdentification getOthr() {
        return othr;
    }

    public void setOthr(GenericOrganisationIdentification value) {
        this.othr = value;
    }
}
