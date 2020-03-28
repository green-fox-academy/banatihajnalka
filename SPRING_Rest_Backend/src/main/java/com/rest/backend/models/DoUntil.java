package com.rest.backend.models;

public class DoUntil {

    private Integer until;

    public DoUntil() {
    }

    public DoUntil(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer sum() {
        int s = 0;
        for (int i = 1; i <= until; i++) {
            s += 1;
        }
        return s;
    }

    public Integer factor() {
        int f = 1;
        for (int i = 1; i <= until; i++) {
            f *= i;
        }
        return f;
    }
}