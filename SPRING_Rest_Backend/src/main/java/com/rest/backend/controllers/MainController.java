package com.rest.backend.controllers;

import com.rest.backend.models.AppendA;
import com.rest.backend.models.Doubling;
import com.rest.backend.models.Greeter;
import com.rest.backend.models.RestError;
import com.rest.backend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private ResponseEntity getDoubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new RestError("Please provide an input!"));
        } else {
            Doubling doubling = restService.getDoubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping("/greeter")
    private ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new RestError("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.status(400).body(new RestError("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.status(400).body(new RestError("Please provide a title!"));
        } else {
            return ResponseEntity.status(200).body(new Greeter("Oh, hi there " + name + ", my dear " + title + "!"));
        }
    }

    @GetMapping("/appenda/{appendable}")
    private ResponseEntity append(@PathVariable String appendable) {
        AppendA appendA = restService.append(appendable);
        return ResponseEntity.status(200).body(appendA);
    }

    @GetMapping("/appenda")
    private ResponseEntity appendError() {
        return ResponseEntity.status(404).body(new RestError("No message available"));
    }


}
