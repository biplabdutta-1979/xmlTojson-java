package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxParty1", propOrder = {
    "taxId",
    "regnId",
    "taxTp"
})
public class TaxParty1 {
    @XmlElement(name = "TaxId")
    protected String taxId;
    
    @XmlElement(name = "RegnId")
    protected String regnId;
    
    @XmlElement(name = "TaxTp")
    protected String taxTp;

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String value) {
        this.taxId = value;
    }

    public String getRegnId() {
        return regnId;
    }

    public void setRegnId(String value) {
        this.regnId = value;
    }

    public String getTaxTp() {
        return taxTp;
    }

    public void setTaxTp(String value) {
        this.taxTp = value;
    }
}
