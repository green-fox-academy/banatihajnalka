package com.rest.backend.services;

import com.rest.backend.models.*;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    public Doubling getDoubling(Integer input) {
        return new Doubling(input, input * 2);
    }

    public RestError getNoInputErrorMessage() {
        return new RestError("Please provide an input!");
    }

    public AppendA append(String appendable) {
        return new AppendA(appendable + "a");
    }

    public Integer doUntil(DoUntil until, String action) {
        int result = 0;
        if (action.equals("sum")) {
            result = until.sum();
        } else if (action.equals("factor")) {
            result = until.factor();
        }
        return result;
    }

}
