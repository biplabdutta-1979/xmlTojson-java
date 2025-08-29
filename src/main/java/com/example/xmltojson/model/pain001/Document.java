package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrCdtTrfInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
public class Document {
    @XmlElement(name = "CstmrCdtTrfInitn", required = true, namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    protected CustomerCreditTransferInitiation cstmrCdtTrfInitn;

    public CustomerCreditTransferInitiation getCstmrCdtTrfInitn() {
        return cstmrCdtTrfInitn;
    }

    public void setCstmrCdtTrfInitn(CustomerCreditTransferInitiation value) {
        this.cstmrCdtTrfInitn = value;
    }
}
