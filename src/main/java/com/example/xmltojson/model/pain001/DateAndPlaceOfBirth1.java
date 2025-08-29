package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPlaceOfBirth1", propOrder = {
    "birthDt",
    "prvcOfBirth",
    "cityOfBirth",
    "ctryOfBirth"
})
public class DateAndPlaceOfBirth1 {
    @XmlElement(name = "BirthDt", required = true)
    protected String birthDt;
    
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    
    @XmlElement(name = "CityOfBirth", required = true)
    protected String cityOfBirth;
    
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;

    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String value) {
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
