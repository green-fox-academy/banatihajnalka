package com.rest.backend.models;

public class RestError {

   private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public RestError(String error) {


        this.error = error;
    }
}
