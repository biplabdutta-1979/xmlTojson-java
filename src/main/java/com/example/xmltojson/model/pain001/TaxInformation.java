package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation", propOrder = {
    "cdtr",
    "dbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxInformation {
    @XmlElement(name = "Cdtr")
    protected TaxParty1 cdtr;
    
    @XmlElement(name = "Dbtr")
    protected TaxParty2 dbtr;
    
    @XmlElement(name = "AdmstnZone")
    protected String admstnZone;
    
    @XmlElement(name = "RefNb")
    protected String refNb;
    
    @XmlElement(name = "Mtd")
    protected String mtd;
    
    @XmlElement(name = "TtlTaxblBaseAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    
    @XmlElement(name = "TtlTaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    
    @XmlElement(name = "Dt")
    protected String dt;
    
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    
    @XmlElement(name = "Rcrd")
    protected TaxRecord1 rcrd;

    // Getters and Setters
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    public TaxParty2 getDbtr() {
        return dbtr;
    }

    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    public String getAdmstnZone() {
        return admstnZone;
    }

    public void setAdmstnZone(String value) {
        this.admstnZone = value;
    }

    public String getRefNb() {
        return refNb;
    }

    public void setRefNb(String value) {
        this.refNb = value;
    }

    public String getMtd() {
        return mtd;
    }

    public void setMtd(String value) {
        this.mtd = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String value) {
        this.dt = value;
    }

    public String getSeqNb() {
        return seqNb;
    }

    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    public TaxRecord1 getRcrd() {
        return rcrd;
    }

    public void setRcrd(TaxRecord1 value) {
        this.rcrd = value;
    }
}
