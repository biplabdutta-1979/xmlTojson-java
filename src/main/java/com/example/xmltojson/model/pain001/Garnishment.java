package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garnishment", propOrder = {
    "tp",
    "grnshee",
    "grnshmtAdmstr",
    "refNb",
    "dt",
    "rmtdAmt",
    "fmlyMdclInsrncInd",
    "mplyeeTermntnInd"
})
public class Garnishment {
    @XmlElement(name = "Tp", required = true)
    protected GarnishmentType1 tp;
    
    @XmlElement(name = "Grnshee")
    protected PartyIdentification135 grnshee;
    
    @XmlElement(name = "GrnshmtAdmstr")
    protected PartyIdentification135 grnshmtAdmstr;
    
    @XmlElement(name = "RefNb")
    protected String refNb;
    
    @XmlElement(name = "Dt")
    protected String dt;
    
    @XmlElement(name = "RmtdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rmtdAmt;
    
    @XmlElement(name = "FmlyMdclInsrncInd")
    protected boolean fmlyMdclInsrncInd;
    
    @XmlElement(name = "MplyeeTermntnInd")
    protected boolean mplyeeTermntnInd;

    // Getters and Setters
    public GarnishmentType1 getTp() {
        return tp;
    }

    public void setTp(GarnishmentType1 value) {
        this.tp = value;
    }

    public PartyIdentification135 getGrnshee() {
        return grnshee;
    }

    public void setGrnshee(PartyIdentification135 value) {
        this.grnshee = value;
    }

    public PartyIdentification135 getGrnshmtAdmstr() {
        return grnshmtAdmstr;
    }

    public void setGrnshmtAdmstr(PartyIdentification135 value) {
        this.grnshmtAdmstr = value;
    }

    public String getRefNb() {
        return refNb;
    }

    public void setRefNb(String value) {
        this.refNb = value;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String value) {
        this.dt = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

    public boolean isFmlyMdclInsrncInd() {
        return fmlyMdclInsrncInd;
    }

    public void setFmlyMdclInsrncInd(boolean value) {
        this.fmlyMdclInsrncInd = value;
    }

    public boolean isMplyeeTermntnInd() {
        return mplyeeTermntnInd;
    }

    public void setMplyeeTermntnInd(boolean value) {
        this.mplyeeTermntnInd = value;
    }
}
