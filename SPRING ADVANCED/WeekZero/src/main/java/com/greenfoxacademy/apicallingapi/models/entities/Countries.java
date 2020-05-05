package com.greenfoxacademy.apicallingapi.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Countries {

    @JsonProperty("Country")
    private String country;
    @JsonProperty("Slug")
    private String slug;
    @JsonProperty("ISO2")
    private String iSO2;

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("Slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("ISO2")
    public String getISO2() {
        return iSO2;
    }

    @JsonProperty("ISO2")
    public void setISO2(String iSO2) {
        this.iSO2 = iSO2;
    }

}