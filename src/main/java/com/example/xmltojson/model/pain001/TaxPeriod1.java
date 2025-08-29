package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
// Temporarily using fully qualified name to test if class is available
// import jakarta.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPeriod1", propOrder = {
    "yr",
    "tp",
    "frToDt"
})
public class TaxPeriod1 {
    @XmlElement(name = "Yr")
    protected String yr;
    
    @XmlElement(name = "Tp")
    protected String tp;
    
    @XmlElement(name = "FrToDt")
    protected DatePeriodDetails1 frToDt;

    public String getYr() {
        return yr;
    }

    public void setYr(String value) {
        this.yr = value;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String value) {
        this.tp = value;
    }

    public DatePeriodDetails1 getFrToDt() {
        return frToDt;
    }

    public void setFrToDt(DatePeriodDetails1 value) {
        this.frToDt = value;
    }
}
