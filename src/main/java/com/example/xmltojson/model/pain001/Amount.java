package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Amount {
    @XmlElement(name = "InstdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private InstructedAmount instdAmt;

    public InstructedAmount getInstdAmt() { return instdAmt; }
    public void setInstdAmt(InstructedAmount instdAmt) { this.instdAmt = instdAmt; }
}
