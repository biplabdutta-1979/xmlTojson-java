package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentTypeInformation {
    @XmlElement(name = "SvcLvl", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private ServiceLevel svcLvl;

    public ServiceLevel getSvcLvl() { return svcLvl; }
    public void setSvcLvl(ServiceLevel svcLvl) { this.svcLvl = svcLvl; }
}
