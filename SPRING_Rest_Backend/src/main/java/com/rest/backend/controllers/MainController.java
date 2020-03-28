package com.rest.backend.controllers;

import com.rest.backend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private RestService restService;

    @Autowired
    public MainController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/")
    public String renderIndex() {
        return "index";
    }
}
