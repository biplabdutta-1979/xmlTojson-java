package com.example.xmltojson.model.pain001;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ExternalOrganisationIdentification1Code")
@XmlEnum
public enum ExternalOrganisationIdentification1Code {
    BORN,
    CHID,
    CHTY,
    CIN,
    CIST,
    COID,
    COSE,
    DUNS,
    EDF,
    EMPL,
    EXID,
    FIIN,
    GIIN,
    GS1,
    HIN,
    IDCD,
    LEI,
    MISC,
    NIDN,
    NRIN,
    OTHR,
    PPN,
    RAN,
    RAP,
    SIREN,
    SIRET,
    SREN,
    TIN,
    UNSP,
    VNID;

    public String value() {
        return name();
    }

    public static ExternalOrganisationIdentification1Code fromValue(String v) {
        return valueOf(v);
    }
}
