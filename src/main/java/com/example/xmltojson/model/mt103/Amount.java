package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class Amount {
    @JsonProperty("InstdAmt")
    private BigDecimal instructedAmount;
    
    @JsonProperty("Ccy")
    private String currency;

    public BigDecimal getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(BigDecimal instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
