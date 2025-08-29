package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceLevel {
    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String cd;

    public String getCd() { return cd; }
    public void setCd(String cd) { this.cd = cd; }
}
