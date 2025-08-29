package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentInformation {
    @XmlElement(name = "PmtInfId", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String pmtInfId;
    @XmlElement(name = "PmtMtd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String pmtMtd;
    @XmlElement(name = "NbOfTxs", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String nbOfTxs;
    @XmlElement(name = "CtrlSum", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String ctrlSum;
    @XmlElement(name = "PmtTpInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private PaymentTypeInformation pmtTpInf;
    @XmlElement(name = "ReqdExctnDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String reqdExctnDt;
    @XmlElement(name = "Dbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private PartyIdentification dbtr;
    @XmlElement(name = "DbtrAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private AccountIdentification dbtrAcct;
    @XmlElement(name = "DbtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private FinancialInstitutionIdentification dbtrAgt;
    @XmlElement(name = "CdtTrfTxInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private List<CreditTransferTransactionInformation> cdtTrfTxInf;

    public String getPmtInfId() {
        return pmtInfId;
    }

    public void setPmtInfId(String pmtInfId) {
        this.pmtInfId = pmtInfId;
    }

    public String getPmtMtd() {
        return pmtMtd;
    }

    public void setPmtMtd(String pmtMtd) {
        this.pmtMtd = pmtMtd;
    }

    public String getNbOfTxs() {
        return nbOfTxs;
    }

    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    public String getCtrlSum() {
        return ctrlSum;
    }

    public void setCtrlSum(String ctrlSum) {
        this.ctrlSum = ctrlSum;
    }

    public PaymentTypeInformation getPmtTpInf() {
        return pmtTpInf;
    }

    public void setPmtTpInf(PaymentTypeInformation pmtTpInf) {
        this.pmtTpInf = pmtTpInf;
    }

    public String getReqdExctnDt() {
        return reqdExctnDt;
    }

    public void setReqdExctnDt(String reqdExctnDt) {
        this.reqdExctnDt = reqdExctnDt;
    }

    public PartyIdentification getDbtr() {
        return dbtr;
    }

    public void setDbtr(PartyIdentification dbtr) {
        this.dbtr = dbtr;
    }

    public AccountIdentification getDbtrAcct() {
        return dbtrAcct;
    }

    public void setDbtrAcct(AccountIdentification dbtrAcct) {
        this.dbtrAcct = dbtrAcct;
    }

    public FinancialInstitutionIdentification getDbtrAgt() {
        return dbtrAgt;
    }

    public void setDbtrAgt(FinancialInstitutionIdentification dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    public List<CreditTransferTransactionInformation> getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    public void setCdtTrfTxInf(List<CreditTransferTransactionInformation> cdtTrfTxInf) {
        this.cdtTrfTxInf = cdtTrfTxInf;
    }
}
