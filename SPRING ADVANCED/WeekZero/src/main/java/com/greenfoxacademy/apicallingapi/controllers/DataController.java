package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponse;
import com.greenfoxacademy.apicallingapi.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DataController {

    private CountryService countryService;

    @Autowired
    public DataController(CountryService countryService) {
        this.countryService = countryService;
    }

    public List<CountryResponse> getCountries() throws IOException {
        return countryService.getCountries();
    }



}
