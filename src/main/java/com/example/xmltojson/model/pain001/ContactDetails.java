package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails", propOrder = {
    "nmPrfx",
    "nm",
    "phneNb",
    "mobNb",
    "faxNb",
    "emailAdr",
    "othr"
})
public class ContactDetails {
    @XmlElement(name = "NmPrfx")
    protected String nmPrfx;
    
    @XmlElement(name = "Nm")
    protected String nm;
    
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    
    @XmlElement(name = "MobNb")
    protected String mobNb;
    
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    
    @XmlElement(name = "Othr")
    protected String othr;

    // Getters and Setters
    public String getNmPrfx() { return nmPrfx; }
    public void setNmPrfx(String value) { this.nmPrfx = value; }
    
    public String getNm() { return nm; }
    public void setNm(String value) { this.nm = value; }
    
    public String getPhneNb() { return phneNb; }
    public void setPhneNb(String value) { this.phneNb = value; }
    
    public String getMobNb() { return mobNb; }
    public void setMobNb(String value) { this.mobNb = value; }
    
    public String getFaxNb() { return faxNb; }
    public void setFaxNb(String value) { this.faxNb = value; }
    
    public String getEmailAdr() { return emailAdr; }
    public void setEmailAdr(String value) { this.emailAdr = value; }
    
    public String getOthr() { return othr; }
    public void setOthr(String value) { this.othr = value; }
}
