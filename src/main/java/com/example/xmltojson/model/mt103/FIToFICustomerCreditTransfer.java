package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FIToFICustomerCreditTransfer {
    @JsonProperty("GrpHdr")
    private GroupHeader groupHeader;
    
    @JsonProperty("CdtTrfTxInf")
    private CreditTransferTransactionInformation creditTransferTransactionInformation;

    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    public void setGroupHeader(GroupHeader groupHeader) {
        this.groupHeader = groupHeader;
    }

    public CreditTransferTransactionInformation getCreditTransferTransactionInformation() {
        return creditTransferTransactionInformation;
    }

    public void setCreditTransferTransactionInformation(CreditTransferTransactionInformation creditTransferTransactionInformation) {
        this.creditTransferTransactionInformation = creditTransferTransactionInformation;
    }
}
