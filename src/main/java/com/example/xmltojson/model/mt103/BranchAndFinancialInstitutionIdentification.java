package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BranchAndFinancialInstitutionIdentification {
    @JsonProperty("FinInstnId")
    private FinancialInstitutionIdentification financialInstitutionId;

    public FinancialInstitutionIdentification getFinancialInstitutionId() {
        return financialInstitutionId;
    }

    public void setFinancialInstitutionId(FinancialInstitutionIdentification financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId;
    }
}
