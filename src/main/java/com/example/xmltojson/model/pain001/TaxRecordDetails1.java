package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecordDetails1", propOrder = {
    "prd",
    "amt"
})
public class TaxRecordDetails1 {
    @XmlElement(name = "Prd")
    protected TaxPeriod1 prd;
    
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;

    public TaxPeriod1 getPrd() {
        return prd;
    }

    public void setPrd(TaxPeriod1 value) {
        this.prd = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }
}
