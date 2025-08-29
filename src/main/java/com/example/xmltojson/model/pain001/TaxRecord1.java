package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecord1", propOrder = {
    "tp",
    "ctgy",
    "ctgyDtls",
    "dbtrSts",
    "certId",
    "frmsCd",
    "prd",
    "taxAmt",
    "addtlInf"
})
public class TaxRecord1 {
    @XmlElement(name = "Tp")
    protected String tp;
    
    @XmlElement(name = "Ctgy")
    protected String ctgy;
    
    @XmlElement(name = "CtgyDtls")
    protected String ctgyDtls;
    
    @XmlElement(name = "DbtrSts")
    protected String dbtrSts;
    
    @XmlElement(name = "CertId")
    protected String certId;
    
    @XmlElement(name = "FrmsCd")
    protected String frmsCd;
    
    @XmlElement(name = "Prd")
    protected TaxPeriod1 prd;
    
    @XmlElement(name = "TaxAmt")
    protected TaxAmount1 taxAmt;
    
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    // Getters and Setters
    public String getTp() {
        return tp;
    }

    public void setTp(String value) {
        this.tp = value;
    }

    public String getCtgy() {
        return ctgy;
    }

    public void setCtgy(String value) {
        this.ctgy = value;
    }

    public String getCtgyDtls() {
        return ctgyDtls;
    }

    public void setCtgyDtls(String value) {
        this.ctgyDtls = value;
    }

    public String getDbtrSts() {
        return dbtrSts;
    }

    public void setDbtrSts(String value) {
        this.dbtrSts = value;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String value) {
        this.certId = value;
    }

    public String getFrmsCd() {
        return frmsCd;
    }

    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    public TaxPeriod1 getPrd() {
        return prd;
    }

    public void setPrd(TaxPeriod1 value) {
        this.prd = value;
    }

    public TaxAmount1 getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(TaxAmount1 value) {
        this.taxAmt = value;
    }

    public String getAddtlInf() {
        return addtlInf;
    }

    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }
}
