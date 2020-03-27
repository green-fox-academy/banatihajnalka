package com.rest.backend.services;

import com.rest.backend.models.AppendA;
import com.rest.backend.models.Doubling;
import com.rest.backend.models.RestError;
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

}
