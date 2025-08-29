package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purpose", propOrder = {
    "cd"
})
public class Purpose {
    @XmlElement(name = "Cd")
    protected String cd;

    public String getCd() {
        return cd;
    }

    public void setCd(String value) {
        this.cd = value;
    }
}
