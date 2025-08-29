package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AccountId {
    @XmlElement(name = "IBAN", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String iban;

    public String getIban() { return iban; }
    public void setIban(String iban) { this.iban = iban; }
}
