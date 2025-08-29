package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class CreditTransferTransactionInformation {
    @XmlElement(name = "PmtId", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private PaymentIdentification pmtId;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private Amount amt;
    @XmlElement(name = "CdtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private FinancialInstitutionIdentification cdtrAgt;
    @XmlElement(name = "Cdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private PartyIdentification cdtr;
    @XmlElement(name = "CdtrAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private AccountIdentification cdtrAcct;
    @XmlElement(name = "RmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private RemittanceInformation rmtInf;
    public PaymentIdentification getPmtId() {
        return pmtId;
    }
    public void setPmtId(PaymentIdentification pmtId) {
        this.pmtId = pmtId;
    }
    public Amount getAmt() {
        return amt;
    }
    public void setAmt(Amount amt) {
        this.amt = amt;
    }
    public FinancialInstitutionIdentification getCdtrAgt() {
        return cdtrAgt;
    }
    public void setCdtrAgt(FinancialInstitutionIdentification cdtrAgt) {
        this.cdtrAgt = cdtrAgt;
    }
    public PartyIdentification getCdtr() {
        return cdtr;
    }
    public void setCdtr(PartyIdentification cdtr) {
        this.cdtr = cdtr;
    }
    public AccountIdentification getCdtrAcct() {
        return cdtrAcct;
    }
    public void setCdtrAcct(AccountIdentification cdtrAcct) {
        this.cdtrAcct = cdtrAcct;
    }
    public RemittanceInformation getRmtInf() {
        return rmtInf;
    }
    public void setRmtInf(RemittanceInformation rmtInf) {
        this.rmtInf = rmtInf;
    }

    // Getters and setters omitted for brevity (will be generated in full implementation)
    
}
