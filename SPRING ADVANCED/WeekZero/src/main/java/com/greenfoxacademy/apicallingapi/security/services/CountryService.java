package com.greenfoxacademy.apicallingapi.security.services;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponseDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface CountryService {

    List<CountryResponseDTO> getCountries() throws IOException;
}
