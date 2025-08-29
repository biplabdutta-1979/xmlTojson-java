package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification", propOrder = {
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification {
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth dtAndPlcOfBirth;
    
    @XmlElement(name = "Othr")
    protected GenericPersonIdentification othr;

    public DateAndPlaceOfBirth getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth value) {
        this.dtAndPlcOfBirth = value;
    }

    public GenericPersonIdentification getOthr() {
        return othr;
    }

    public void setOthr(GenericPersonIdentification value) {
        this.othr = value;
    }
}
