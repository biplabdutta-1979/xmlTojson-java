package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAuthorisation1", propOrder = {
    "titl",
    "nm"
})
public class TaxAuthorisation1 {
    @XmlElement(name = "Titl")
    protected String titl;
    
    @XmlElement(name = "Nm")
    protected String nm;

    public String getTitl() {
        return titl;
    }

    public void setTitl(String value) {
        this.titl = value;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String value) {
        this.nm = value;
    }
}
