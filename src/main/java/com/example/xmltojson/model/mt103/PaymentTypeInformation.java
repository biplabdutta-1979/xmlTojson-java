package com.example.xmltojson.model.mt103;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentTypeInformation {
    @JsonProperty("SvcLvl")
    private ServiceLevel serviceLevel;
    
    @JsonProperty("CtgyPurp")
    private CategoryPurpose categoryPurpose;

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public CategoryPurpose getCategoryPurpose() {
        return categoryPurpose;
    }

    public void setCategoryPurpose(CategoryPurpose categoryPurpose) {
        this.categoryPurpose = categoryPurpose;
    }
}
