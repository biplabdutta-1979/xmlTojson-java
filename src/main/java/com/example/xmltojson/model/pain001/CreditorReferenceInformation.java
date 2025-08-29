package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceInformation", propOrder = {
    "tp",
    "ref"
})
public class CreditorReferenceInformation {
    @XmlElement(name = "Tp")
    protected CreditorReferenceType tp;
    
    @XmlElement(name = "Ref")
    protected String ref;

    public CreditorReferenceType getTp() {
        return tp;
    }

    public void setTp(CreditorReferenceType value) {
        this.tp = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String value) {
        this.ref = value;
    }
}
