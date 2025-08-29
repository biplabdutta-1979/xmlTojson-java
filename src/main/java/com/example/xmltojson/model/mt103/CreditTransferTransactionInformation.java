package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditTransferTransactionInformation {
    @JsonProperty("PmtId")
    private PaymentIdentification paymentId;
    
    @JsonProperty("PmtTpInf")
    private PaymentTypeInformation paymentTypeInformation;
    
    @JsonProperty("IntrBkSttlmAmt")
    private Amount settlementAmount;
    
    @JsonProperty("IntrBkSttlmDt")
    private LocalDate settlementDate;
    
    @JsonProperty("Dbtr")
    private PartyIdentification debtor;
    
    @JsonProperty("DbtrAcct")
    private Account debtorAccount;
    
    @JsonProperty("DbtrAgt")
    private BranchAndFinancialInstitutionIdentification debtorAgent;
    
    @JsonProperty("CdtrAgt")
    private BranchAndFinancialInstitutionIdentification creditorAgent;
    
    @JsonProperty("Cdtr")
    private PartyIdentification creditor;
    
    @JsonProperty("CdtrAcct")
    private Account creditorAccount;
    
    @JsonProperty("RmtInf")
    private RemittanceInformation remittanceInformation;

    // Getters and Setters for all fields
    public PaymentIdentification getPaymentId() { return paymentId; }
    public void setPaymentId(PaymentIdentification paymentId) { this.paymentId = paymentId; }
    
    public PaymentTypeInformation getPaymentTypeInformation() { return paymentTypeInformation; }
    public void setPaymentTypeInformation(PaymentTypeInformation paymentTypeInformation) { this.paymentTypeInformation = paymentTypeInformation; }
    
    public Amount getSettlementAmount() { return settlementAmount; }
    public void setSettlementAmount(Amount settlementAmount) { this.settlementAmount = settlementAmount; }
    
    public LocalDate getSettlementDate() { return settlementDate; }
    public void setSettlementDate(LocalDate settlementDate) { this.settlementDate = settlementDate; }
    
    public PartyIdentification getDebtor() { return debtor; }
    public void setDebtor(PartyIdentification debtor) { this.debtor = debtor; }
    
    public Account getDebtorAccount() { return debtorAccount; }
    public void setDebtorAccount(Account debtorAccount) { this.debtorAccount = debtorAccount; }
    
    public BranchAndFinancialInstitutionIdentification getDebtorAgent() { return debtorAgent; }
    public void setDebtorAgent(BranchAndFinancialInstitutionIdentification debtorAgent) { this.debtorAgent = debtorAgent; }
    
    public BranchAndFinancialInstitutionIdentification getCreditorAgent() { return creditorAgent; }
    public void setCreditorAgent(BranchAndFinancialInstitutionIdentification creditorAgent) { this.creditorAgent = creditorAgent; }
    
    public PartyIdentification getCreditor() { return creditor; }
    public void setCreditor(PartyIdentification creditor) { this.creditor = creditor; }
    
    public Account getCreditorAccount() { return creditorAccount; }
    public void setCreditorAccount(Account creditorAccount) { this.creditorAccount = creditorAccount; }
    
    public RemittanceInformation getRemittanceInformation() { return remittanceInformation; }
    public void setRemittanceInformation(RemittanceInformation remittanceInformation) { this.remittanceInformation = remittanceInformation; }
}
