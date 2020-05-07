package com.greenfoxacademy.apicallingapi.models.dtos;

import com.greenfoxacademy.apicallingapi.models.entities.Country;
import java.util.List;

public class CountryResponseDTO {

    private List<Country> countries;

    public CountryResponseDTO() {
    }

    public CountryResponseDTO(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}