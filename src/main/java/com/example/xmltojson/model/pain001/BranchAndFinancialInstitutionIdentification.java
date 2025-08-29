package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification", propOrder = {
    "finInstnId"
})
public class BranchAndFinancialInstitutionIdentification {
    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification finInstnId;

    public FinancialInstitutionIdentification getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinancialInstitutionIdentification value) {
        this.finInstnId = value;
    }
}
