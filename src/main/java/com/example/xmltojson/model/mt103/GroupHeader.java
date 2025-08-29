package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class GroupHeader {
    @JsonProperty("MsgId")
    private String messageId;
    
    @JsonProperty("CreDtTm")
    private LocalDateTime creationDateTime;
    
    @JsonProperty("NbOfTxs")
    private String numberOfTransactions;
    
    @JsonProperty("CtrlSum")
    private Double controlSum;
    
    @JsonProperty("InitgPty")
    private PartyIdentification initiatingParty;

    // Getters and Setters
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public Double getControlSum() {
        return controlSum;
    }

    public void setControlSum(Double controlSum) {
        this.controlSum = controlSum;
    }

    public PartyIdentification getInitiatingParty() {
        return initiatingParty;
    }

    public void setInitiatingParty(PartyIdentification initiatingParty) {
        this.initiatingParty = initiatingParty;
    }
}
