package com.greenfoxacademy.apicallingapi.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.greenfoxacademy.apicallingapi.models.entities.Countries;
import com.greenfoxacademy.apicallingapi.services.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

class GetCountries implements Callback<List<Countries>> {

    private final String DATA_BASE_URL = "https://api.covid19api.com";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DATA_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RetrofitService retrofitService = retrofit.create(RetrofitService.class);

        Call<List<Countries>> call = retrofitService.getCountries();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Countries>> call, Response<List<Countries>> repsonse) {
        if (repsonse.isSuccessful()) {
            List<Countries> countries = repsonse.body();
            System.out.println(countries);
        } else {
            System.out.println(repsonse.errorBody());
        }
    }

    public void onFailure(Call<List<Countries>> call, Throwable t) {
        t.printStackTrace();
    }
}

