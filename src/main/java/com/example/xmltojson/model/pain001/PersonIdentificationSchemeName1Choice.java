package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlSchemaType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentificationSchemeName1Choice", propOrder = {
    "cd",
    "prtry"
})
public class PersonIdentificationSchemeName1Choice {
    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected ExternalPersonIdentification1Code cd;
    
    @XmlElement(name = "Prtry")
    protected String prtry;

    public ExternalPersonIdentification1Code getCd() {
        return cd;
    }

    public void setCd(ExternalPersonIdentification1Code value) {
        this.cd = value;
    }

    public String getPrtry() {
        return prtry;
    }

    public void setPrtry(String value) {
        this.prtry = value;
    }
}
