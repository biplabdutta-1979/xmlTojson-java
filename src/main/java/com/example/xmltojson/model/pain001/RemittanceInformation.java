package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RemittanceInformation {
    @XmlElement(name = "Ustrd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String ustrd;

    public String getUstrd() { return ustrd; }
    public void setUstrd(String ustrd) { this.ustrd = ustrd; }
}
