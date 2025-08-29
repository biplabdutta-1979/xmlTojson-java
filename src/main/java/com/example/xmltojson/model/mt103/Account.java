package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
    @JsonProperty("Id")
    private AccountIdentification id;

    public AccountIdentification getId() {
        return id;
    }

    public void setId(AccountIdentification id) {
        this.id = id;
    }
}
