package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface CountryService {

    List<CountryResponse> getCountries() throws IOException;
}
