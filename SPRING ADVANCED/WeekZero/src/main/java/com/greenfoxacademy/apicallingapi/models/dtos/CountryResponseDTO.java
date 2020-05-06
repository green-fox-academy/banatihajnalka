package com.greenfoxacademy.apicallingapi.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CountryResponseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Slug")
    private String slug;
    @JsonProperty("ISO2")
    private String iSO2;

    public CountryResponseDTO() {
    }

    public CountryResponseDTO(String country, String slug, String iSO2) {
        this.country = country;
        this.slug = slug;
        this.iSO2 = iSO2;
    }

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