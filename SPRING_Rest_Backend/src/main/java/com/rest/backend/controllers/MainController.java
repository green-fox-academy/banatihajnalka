package com.rest.backend.controllers;

import com.rest.backend.models.Doubling;
import com.rest.backend.models.RestError;
import com.rest.backend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private RestService restService;

    @Autowired
    public MainController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/")
    private String renderIndex() {
        return "index";
    }

    @GetMapping("/doubling")
    private ResponseEntity getDoubling(@RequestParam (required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new RestError("Please provide an input!"));
        } else {
            Doubling doubling = restService.getDoubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

}
