package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class GroupHeader {
    @XmlElement(name = "MsgId", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String msgId;
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String creDtTm;
    @XmlElement(name = "NbOfTxs", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String nbOfTxs;
    @XmlElement(name = "CtrlSum", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private String ctrlSum;
    @XmlElement(name = "InitgPty", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    private PartyIdentification initgPty;

    public String getMsgId() { return msgId; }
    public void setMsgId(String msgId) { this.msgId = msgId; }
    public String getCreDtTm() { return creDtTm; }
    public void setCreDtTm(String creDtTm) { this.creDtTm = creDtTm; }
    public String getNbOfTxs() { return nbOfTxs; }
    public void setNbOfTxs(String nbOfTxs) { this.nbOfTxs = nbOfTxs; }
    public String getCtrlSum() { return ctrlSum; }
    public void setCtrlSum(String ctrlSum) { this.ctrlSum = ctrlSum; }
    public PartyIdentification getInitgPty() { return initgPty; }
    public void setInitgPty(PartyIdentification initgPty) { this.initgPty = initgPty; }
}
