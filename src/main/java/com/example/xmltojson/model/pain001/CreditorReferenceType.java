package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceType", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class CreditorReferenceType {
    @XmlElement(name = "CdOrPrtry")
    protected String cdOrPrtry;
    
    @XmlElement(name = "Issr")
    protected String issr;

    public String getCdOrPrtry() {
        return cdOrPrtry;
    }

    public void setCdOrPrtry(String value) {
        this.cdOrPrtry = value;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String value) {
        this.issr = value;
    }
}
