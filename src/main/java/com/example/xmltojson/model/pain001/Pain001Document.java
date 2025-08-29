package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pain001Document {
    @XmlElement(name = "CstmrCdtTrfInitn", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private CustomerCreditTransferInitiation cstmrCdtTrfInitn;

    public CustomerCreditTransferInitiation getCstmrCdtTrfInitn() {
        return cstmrCdtTrfInitn;
    }

    public void setCstmrCdtTrfInitn(CustomerCreditTransferInitiation cstmrCdtTrfInitn) {
        this.cstmrCdtTrfInitn = cstmrCdtTrfInitn;
    }
}
