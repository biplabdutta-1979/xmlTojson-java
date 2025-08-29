package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FinancialInstitutionIdentification {
    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private FinancialInstitutionId finInstnId;

    public FinancialInstitutionId getFinInstnId() { return finInstnId; }
    public void setFinInstnId(FinancialInstitutionId finInstnId) { this.finInstnId = finInstnId; }
}
