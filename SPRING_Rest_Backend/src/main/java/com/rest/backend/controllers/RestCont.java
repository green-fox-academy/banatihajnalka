package com.rest.backend.controllers;

import com.rest.backend.models.*;
import com.rest.backend.services.RestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestCont {

    private RestService restService;

    public RestCont(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/doubling")
    public ResponseEntity getDoubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new RestError("Please provide an input!"));
        } else {
            Doubling doubling = restService.getDoubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
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
    public ResponseEntity append(@PathVariable String appendable) {
        AppendA appendA = restService.append(appendable);
        return ResponseEntity.status(200).body(appendA);
    }

    @GetMapping("/appenda")
    public ResponseEntity appendError() {
        return ResponseEntity.status(404).body(new RestError("No message available"));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity doUntil(@RequestBody DoUntil until, @PathVariable(required = false) String action) {
        if (until == null) {
            return ResponseEntity.status(400).body(new RestError("Please provide a number!"));
        } else if (action.equals("sum") || action.equals("factor")) {
            return ResponseEntity.status(200).body(new Result(restService.doUntil(until, action)));
        } else {
            return ResponseEntity.status(404).body(new RestError("No action found"));
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity arrayHandler(@RequestBody Arrayhandler arrayhandler) {
        if (arrayhandler.getWhat().equals("sum") || arrayhandler.getWhat().equals("multiply"))  {
            return ResponseEntity.status(200).body(new Result(restService.doWithArrayToInteger(arrayhandler, arrayhandler.getWhat())));
        } else if (arrayhandler.getWhat().equals("double")) {
            return ResponseEntity.status(200).body(new ResultArray(restService.doubleArrayElements(arrayhandler.getNumbers())));
        } else if (arrayhandler.getNumbers() == null) {
            return ResponseEntity.status(400).body(new RestError("Please provide a number"));
        } else {
            return ResponseEntity.status(400).body(new RestError("Please provide what to do with the numbers!"));
        }
     }
}
