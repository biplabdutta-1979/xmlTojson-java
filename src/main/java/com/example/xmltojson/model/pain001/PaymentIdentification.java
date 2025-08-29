package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentIdentification {
    @XmlElement(name = "EndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String endToEndId;

    public String getEndToEndId() { return endToEndId; }
    public void setEndToEndId(String endToEndId) { this.endToEndId = endToEndId; }
}
