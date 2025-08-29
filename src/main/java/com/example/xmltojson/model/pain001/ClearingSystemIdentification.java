package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemIdentification", propOrder = {
    "cd"
})
public class ClearingSystemIdentification {
    @XmlElement(name = "Cd", required = true)
    protected String cd;

    public String getCd() {
        return cd;
    }

    public void setCd(String value) {
        this.cd = value;
    }
}
