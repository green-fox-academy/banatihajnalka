package com.rest.backend.services;

import com.rest.backend.models.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

@Service
public class RestService {

    public Doubling getDoubling(Integer input) {
        return new Doubling(input, input * 2);
    }

    public AppendA append(String appendable) {
        return new AppendA(appendable + "a");
    }

    public Integer doUntil(DoUntil until, String action) {
        int result = 0;
        if (action.equals("sum")) {
            result = sum(until);
        } else if (action.equals("factor")) {
            result = factor(until);
        }
        return result;
    }

    public Integer factor(DoUntil until) {
        int f = 1;
        for (int i = 1; i <= until.getUntil(); i++) {
            f *= i;
        }
        return f;
    }

    public Integer sum(DoUntil until) {
        int s = 0;
        for (int i = 1; i <= until.getUntil(); i++) {
            s += i;
        }
        return s;
    }

    public Integer doWithArrayToInteger(Arrayhandler arrayhandler, String what) {
        int result = 0;
        if (arrayhandler.getWhat().equals("sum")) {
            result = sumArray(arrayhandler.getNumbers());
        } else if (arrayhandler.getWhat().equals("multiply")) {
            result = multiplyArray(arrayhandler.getNumbers());
        }
        return result;
    }

    private int sumArray(Integer[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    private int multiplyArray(Integer[] numbers) {
        int multiplied = 1;
        for (int number : numbers) {
            multiplied *= number;
        }
        return multiplied;
    }

    public Integer[] doubleArrayElements(Integer[] numbers) {
       Integer[] result = new Integer[numbers.length];
            for(int i = 0; i< numbers.length ; ++i) {
                result[i]= numbers[i] *2;
            }
            return result;
    }
}

