package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class InstructedAmount {
    @XmlValue
    private String value;
    @XmlAttribute(name = "Ccy")
    private String ccy;

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public String getCcy() { return ccy; }
    public void setCcy(String ccy) { this.ccy = ccy; }
}
