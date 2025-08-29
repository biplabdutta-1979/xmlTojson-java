package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AccountIdentification {
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private AccountId id;

    public AccountId getId() { return id; }
    public void setId(AccountId id) { this.id = id; }
}
