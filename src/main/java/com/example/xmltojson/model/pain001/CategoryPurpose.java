package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryPurpose", propOrder = {
    "cd"
})
public class CategoryPurpose {
    @XmlElement(name = "Cd")
    protected String cd;

    public String getCd() {
        return cd;
    }

    public void setCd(String value) {
        this.cd = value;
    }
}
