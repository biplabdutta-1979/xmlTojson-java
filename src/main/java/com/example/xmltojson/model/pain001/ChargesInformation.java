package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesInformation", propOrder = {
    "amt",
    "pty"
})
public class ChargesInformation {
    @XmlElement(name = "Amt", required = true)
    protected Amount amt;
    
    @XmlElement(name = "Pty", required = true)
    protected BranchAndFinancialInstitutionIdentification pty;

    public Amount getAmt() {
        return amt;
    }

    public void setAmt(Amount value) {
        this.amt = value;
    }

    public BranchAndFinancialInstitutionIdentification getPty() {
        return pty;
    }

    public void setPty(BranchAndFinancialInstitutionIdentification value) {
        this.pty = value;
    }
}
