package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RetrofitService {

        @GET("/countries")
        Call<List<CountryResponse>> getCountries();
}
