package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification135", propOrder = {
    "nm",
    "pstlAdr",
    "id"
})
public class PartyIdentification135 {
    @XmlElement(name = "Nm")
    protected String nm;
    
    @XmlElement(name = "PstlAdr")
    protected PostalAddress24 pstlAdr;
    
    @XmlElement(name = "Id")
    protected Party38Choice id;

    public String getNm() {
        return nm;
    }

    public void setNm(String value) {
        this.nm = value;
    }

    public PostalAddress24 getPstlAdr() {
        return pstlAdr;
    }

    public void setPstlAdr(PostalAddress24 value) {
        this.pstlAdr = value;
    }

    public Party38Choice getId() {
        return id;
    }

    public void setId(Party38Choice value) {
        this.id = value;
    }
}
