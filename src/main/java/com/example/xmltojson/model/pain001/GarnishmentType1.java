package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarnishmentType1", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class GarnishmentType1 {
    @XmlElement(name = "CdOrPrtry", required = true)
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
