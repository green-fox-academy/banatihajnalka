package com.greenfoxacademy.apicallingapi.security.services;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponseDTO;
import com.greenfoxacademy.apicallingapi.models.entities.Country;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface CountryService {

    List<Country> getCountries() throws IOException;
}
