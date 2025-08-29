package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount1", propOrder = {
    "rate",
    "taxblBaseAmt",
    "ttlAmt",
    "dtls"
})
public class TaxAmount1 {
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    
    @XmlElement(name = "TaxblBaseAmt")
    protected ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    
    @XmlElement(name = "TtlAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlAmt;
    
    @XmlElement(name = "Dtls")
    protected TaxRecordDetails1 dtls;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    public void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.taxblBaseAmt = value;
    }

    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    public TaxRecordDetails1 getDtls() {
        return dtls;
    }

    public void setDtls(TaxRecordDetails1 value) {
        this.dtls = value;
    }
}
