package com.greenfoxacademy.apicallingapi.services;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class DataService {

    private static final String BASE_URL = "https://api.covid19api.com";
//    private String accessToken;
    private RetrofitService service;

    public DataService() {
    Retrofit retrofit =  new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    service = retrofit.create(RetrofitService.class);
//    this.accessToken = "token " + System.getenv("ACCESS_TOKEN");
    }
}
