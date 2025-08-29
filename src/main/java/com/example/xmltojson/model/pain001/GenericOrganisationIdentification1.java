package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericOrganisationIdentification1", propOrder = {
    "id",
    "schmeNm",
    "issr"
})
public class GenericOrganisationIdentification1 {
    @XmlElement(name = "Id", required = true)
    protected String id;
    
    @XmlElement(name = "SchmeNm")
    protected OrganisationIdentificationSchemeName1Choice schmeNm;
    
    @XmlElement(name = "Issr")
    protected String issr;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public OrganisationIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    public void setSchmeNm(OrganisationIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String value) {
        this.issr = value;
    }
}
