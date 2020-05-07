package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponseDTO;
import com.greenfoxacademy.apicallingapi.models.entities.Country;
import com.greenfoxacademy.apicallingapi.security.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/countries")
    public ResponseEntity getCountries() throws IOException {
        List<Country> countries =  countryService.getCountries();
        return ResponseEntity.status(200).body(new CountryResponseDTO(countries));
    }



}
