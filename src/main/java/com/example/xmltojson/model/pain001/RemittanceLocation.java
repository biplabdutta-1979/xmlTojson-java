package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation", propOrder = {
    "rmtLctnMtd",
    "rmtLctnElctrncAdr",
    "rmtLctnPstlAdr"
})
public class RemittanceLocation {
    @XmlElement(name = "RmtLctnMtd")
    protected String rmtLctnMtd;
    
    @XmlElement(name = "RmtLctnElctrncAdr")
    protected String rmtLctnElctrncAdr;
    
    @XmlElement(name = "RmtLctnPstlAdr")
    protected PostalAddress rmtLctnPstlAdr;

    public String getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    public void setRmtLctnMtd(String value) {
        this.rmtLctnMtd = value;
    }

    public String getRmtLctnElctrncAdr() {
        return rmtLctnElctrncAdr;
    }

    public void setRmtLctnElctrncAdr(String value) {
        this.rmtLctnElctrncAdr = value;
    }

    public PostalAddress getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    public void setRmtLctnPstlAdr(PostalAddress value) {
        this.rmtLctnPstlAdr = value;
    }
}
