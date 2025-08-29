package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialInstitutionIdentification {
    @JsonProperty("BICFI")
    private String bicfi;
    
    @JsonProperty("ClrSysMmbId")
    private ClearingSystemMemberIdentification clearingSystemMemberId;

    public String getBicfi() {
        return bicfi;
    }

    public void setBicfi(String bicfi) {
        this.bicfi = bicfi;
    }

    public ClearingSystemMemberIdentification getClearingSystemMemberId() {
        return clearingSystemMemberId;
    }

    public void setClearingSystemMemberId(ClearingSystemMemberIdentification clearingSystemMemberId) {
        this.clearingSystemMemberId = clearingSystemMemberId;
    }
}
