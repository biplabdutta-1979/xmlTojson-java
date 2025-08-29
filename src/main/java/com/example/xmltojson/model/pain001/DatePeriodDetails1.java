package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriodDetails1", propOrder = {
    "frDt",
    "toDt"
})
public class DatePeriodDetails1 {
    @XmlElement(name = "FrDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frDt;
    
    @XmlElement(name = "ToDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDt;

    public XMLGregorianCalendar getFrDt() {
        return frDt;
    }

    public void setFrDt(XMLGregorianCalendar value) {
        this.frDt = value;
    }

    public XMLGregorianCalendar getToDt() {
        return toDt;
    }

    public void setToDt(XMLGregorianCalendar value) {
        this.toDt = value;
    }
}
