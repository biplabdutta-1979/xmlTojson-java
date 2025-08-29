package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress24", propOrder = {
    "dept",
    "subDept",
    "strtNm",
    "bldgNb",
    "bldgNm",
    "flr",
    "pstBx",
    "room",
    "pstCd",
    "twnNm",
    "twnLctnNm",
    "dstrctNm",
    "ctrySubDvsn",
    "ctry",
    "adrLine"
})
public class PostalAddress24 {
    @XmlElement(name = "Dept")
    protected String dept;
    
    @XmlElement(name = "SubDept")
    protected String subDept;
    
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    
    @XmlElement(name = "BldgNm")
    protected String bldgNm;
    
    @XmlElement(name = "Flr")
    protected String flr;
    
    @XmlElement(name = "PstBx")
    protected String pstBx;
    
    @XmlElement(name = "Room")
    protected String room;
    
    @XmlElement(name = "PstCd")
    protected String pstCd;
    
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    
    @XmlElement(name = "TwnLctnNm")
    protected String twnLctnNm;
    
    @XmlElement(name = "DstrctNm")
    protected String dstrctNm;
    
    @XmlElement(name = "CtrySubDvsn")
    protected String ctrySubDvsn;
    
    @XmlElement(name = "Ctry")
    protected String ctry;
    
    @XmlElement(name = "AdrLine")
    protected List<String> adrLine;

    // Getters and Setters
    public String getDept() {
        return dept;
    }

    public void setDept(String value) {
        this.dept = value;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String value) {
        this.subDept = value;
    }

    public String getStrtNm() {
        return strtNm;
    }

    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    public String getBldgNb() {
        return bldgNb;
    }

    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    public String getBldgNm() {
        return bldgNm;
    }

    public void setBldgNm(String value) {
        this.bldgNm = value;
    }

    public String getFlr() {
        return flr;
    }

    public void setFlr(String value) {
        this.flr = value;
    }

    public String getPstBx() {
        return pstBx;
    }

    public void setPstBx(String value) {
        this.pstBx = value;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String value) {
        this.room = value;
    }

    public String getPstCd() {
        return pstCd;
    }

    public void setPstCd(String value) {
        this.pstCd = value;
    }

    public String getTwnNm() {
        return twnNm;
    }

    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    public String getTwnLctnNm() {
        return twnLctnNm;
    }

    public void setTwnLctnNm(String value) {
        this.twnLctnNm = value;
    }

    public String getDstrctNm() {
        return dstrctNm;
    }

    public void setDstrctNm(String value) {
        this.dstrctNm = value;
    }

    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    public String getCtry() {
        return ctry;
    }

    public void setCtry(String value) {
        this.ctry = value;
    }

    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<>();
        }
        return this.adrLine;
    }

    public void setAdrLine(List<String> adrLine) {
        this.adrLine = adrLine;
    }
}
