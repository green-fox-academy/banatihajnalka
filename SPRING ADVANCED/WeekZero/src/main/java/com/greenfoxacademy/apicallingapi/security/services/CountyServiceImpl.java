package com.greenfoxacademy.apicallingapi.security.services;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponseDTO;
import com.greenfoxacademy.apicallingapi.models.entities.Country;
import com.greenfoxacademy.apicallingapi.repositories.CountryRepository;
import com.greenfoxacademy.apicallingapi.services.DataService;
import com.greenfoxacademy.apicallingapi.services.RetrofitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service
public class CountyServiceImpl implements CountryService {

    private CountryRepository countryRepository;
    private RetrofitService service;
    private DataService dataService;

    @Autowired
    public CountyServiceImpl(CountryRepository countryRepository, DataService dataService) {
        this.countryRepository = countryRepository;
        this.dataService = dataService;
    }

    @Override
    public List<Country> getCountries() throws IOException {
        Call<List<Country>> retrofitCall = service.getCountries();
        Response<List<Country>> response = retrofitCall.execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }
}
