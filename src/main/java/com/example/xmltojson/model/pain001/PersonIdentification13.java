package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification13", propOrder = {
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification13 {
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth1 dtAndPlcOfBirth;
    
    @XmlElement(name = "Othr")
    protected List<GenericPersonIdentification1> othr;

    public DateAndPlaceOfBirth1 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth1 value) {
        this.dtAndPlcOfBirth = value;
    }

    public List<GenericPersonIdentification1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

    public void setOthr(List<GenericPersonIdentification1> othr) {
        this.othr = othr;
    }
}
