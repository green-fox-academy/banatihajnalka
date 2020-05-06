package com.greenfoxacademy.apicallingapi.models.dtos;

import com.greenfoxacademy.apicallingapi.models.entities.Country;
import java.util.List;

public class CountryResponseDTO {

    private String result;
    private List<Country> data;

    public CountryResponseDTO() {
    }

    public CountryResponseDTO(String result, List<Country> data) {
        this.result = result;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Country> getData() {
        return data;
    }

    public void setData(List<Country> data) {
        this.data = data;
    }
}