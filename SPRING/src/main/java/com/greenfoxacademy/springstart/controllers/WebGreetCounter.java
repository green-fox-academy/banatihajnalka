package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounter {

    private static final String template = "Hello, %s.";
    private static AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value="/web/greeting", method= RequestMethod.GET)
    @ResponseBody
    public String greeting(@RequestParam(value= "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting.getContent() + " This site was loaded " + greeting.getId() + " times since last server start.";
    }
}
