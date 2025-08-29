package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FinancialInstitutionId {
    @XmlElement(name = "BIC", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String bic;

    public String getBic() { return bic; }
    public void setBic(String bic) { this.bic = bic; }
}
