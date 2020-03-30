package com.rest.backend.models;

public class Arrayhandler {

    private String what;
    private Integer[] numbers;

    public Arrayhandler(String what, Integer[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }
}
