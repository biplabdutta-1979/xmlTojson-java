package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification29", propOrder = {
    "anyBIC",
    "lei",
    "othr"
})
public class OrganisationIdentification29 {
    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    
    @XmlElement(name = "LEI")
    protected String lei;
    
    @XmlElement(name = "Othr")
    protected List<GenericOrganisationIdentification1> othr;

    public String getAnyBIC() {
        return anyBIC;
    }

    public void setAnyBIC(String value) {
        this.anyBIC = value;
    }

    public String getLEI() {
        return lei;
    }

    public void setLEI(String value) {
        this.lei = value;
    }

    public List<GenericOrganisationIdentification1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

    public void setOthr(List<GenericOrganisationIdentification1> othr) {
        this.othr = othr;
    }
}
