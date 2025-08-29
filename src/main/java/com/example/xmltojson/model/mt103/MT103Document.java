package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MT103Document {
    @JsonProperty("FIToFICustomerCreditTransfer")
    private FIToFICustomerCreditTransfer fiToFICustomerCreditTransfer;

    public FIToFICustomerCreditTransfer getFiToFICustomerCreditTransfer() {
        return fiToFICustomerCreditTransfer;
    }

    public void setFiToFICustomerCreditTransfer(FIToFICustomerCreditTransfer fiToFICustomerCreditTransfer) {
        this.fiToFICustomerCreditTransfer = fiToFICustomerCreditTransfer;
    }
}
