package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ExternalPersonIdentification1Code")
@XmlEnum
public enum ExternalPersonIdentification1Code {
    ARNU,
    CCPT,
    CHTY,
    CORP,
    DRLC,
    FIIN,
    TXID,
    SRSA,
    IDCD,
    EMID,
    NDIS,
    ANDI,
    ANID,
    PASS,
    DCPR,
    INPS,
    LCTN,
    MISC,
    MARY,
    BIRP,
    CITZ,
    COUN,
    SOCS,
    IDCDT,
    OTHR,
    PRGP,
    GUNL,
    TINV,
    DODS,
    GTIN,
    EDF,
    CUST,
    NRIN,
    PRXY,
    PPRT,
    SSYN,
    UNSP;

    public String value() {
        return name();
    }

    public static ExternalPersonIdentification1Code fromValue(String v) {
        return valueOf(v);
    }
}
