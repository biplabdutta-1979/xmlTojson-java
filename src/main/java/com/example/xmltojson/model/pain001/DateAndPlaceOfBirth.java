package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPlaceOfBirth", propOrder = {
    "birthDt",
    "prvcOfBirth",
    "cityOfBirth",
    "ctryOfBirth"
})
public class DateAndPlaceOfBirth {
    @XmlElement(name = "BirthDt", required = true)
    protected XMLGregorianCalendar birthDt;
    
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    
    @XmlElement(name = "CityOfBirth", required = true)
    protected String cityOfBirth;
    
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;

    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    public String getPrvcOfBirth() {
        return prvcOfBirth;
    }

    public void setPrvcOfBirth(String value) {
        this.prvcOfBirth = value;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    public void setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
    }
}
