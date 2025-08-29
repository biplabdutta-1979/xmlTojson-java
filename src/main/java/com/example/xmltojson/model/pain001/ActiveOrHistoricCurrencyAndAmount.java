package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveOrHistoricCurrencyAndAmount", propOrder = {
    "value",
    "ccy"
})
public class ActiveOrHistoricCurrencyAndAmount {
    @XmlValue
    protected BigDecimal value;
    
    @XmlAttribute(name = "Ccy")
    protected String ccy;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String value) {
        this.ccy = value;
    }
}
