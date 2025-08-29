package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation", propOrder = {
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation {
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation cdtrRefInf;
    
    @XmlElement(name = "Invcr")
    protected PartyIdentification invcr;
    
    @XmlElement(name = "Invcee")
    protected PartyIdentification invcee;
    
    @XmlElement(name = "TaxRmt")
    protected TaxInformation taxRmt;
    
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment grnshmtRmt;
    
    @XmlElement(name = "AddtlRmtInf")
    protected String addtlRmtInf;

    public CreditorReferenceInformation getCdtrRefInf() {
        return cdtrRefInf;
    }

    public void setCdtrRefInf(CreditorReferenceInformation value) {
        this.cdtrRefInf = value;
    }

    public PartyIdentification getInvcr() {
        return invcr;
    }

    public void setInvcr(PartyIdentification value) {
        this.invcr = value;
    }

    public PartyIdentification getInvcee() {
        return invcee;
    }

    public void setInvcee(PartyIdentification value) {
        this.invcee = value;
    }

    public TaxInformation getTaxRmt() {
        return taxRmt;
    }

    public void setTaxRmt(TaxInformation value) {
        this.taxRmt = value;
    }

    public Garnishment getGrnshmtRmt() {
        return grnshmtRmt;
    }

    public void setGrnshmtRmt(Garnishment value) {
        this.grnshmtRmt = value;
    }

    public String getAddtlRmtInf() {
        return addtlRmtInf;
    }

    public void setAddtlRmtInf(String value) {
        this.addtlRmtInf = value;
    }
}
