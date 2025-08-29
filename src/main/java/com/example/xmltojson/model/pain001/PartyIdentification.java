package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartyIdentification {
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String nm;

    public String getNm() { return nm; }
    public void setNm(String nm) { this.nm = nm; }
}
