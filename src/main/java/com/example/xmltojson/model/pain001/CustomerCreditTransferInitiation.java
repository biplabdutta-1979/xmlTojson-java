package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerCreditTransferInitiation {
    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private GroupHeader grpHdr;
    @XmlElement(name = "PmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private List<PaymentInformation> pmtInf;

    public GroupHeader getGrpHdr() { return grpHdr; }
    public void setGrpHdr(GroupHeader grpHdr) { this.grpHdr = grpHdr; }
    public List<PaymentInformation> getPmtInf() { return pmtInf; }
    public void setPmtInf(List<PaymentInformation> pmtInf) { this.pmtInf = pmtInf; }
}
