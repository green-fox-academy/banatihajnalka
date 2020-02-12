package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoof {

    private static AtomicLong counter = new AtomicLong(1);

    @GetMapping("/fbw")
    public String greeting(Model model) {
        long a = counter.getAndIncrement();
        String output = "";
        int size = 18;
        for (int i = 0; i < a; i++) {
            if (a % 105 == 0) {
                output = "FizzBuzzWoof";
                size = 72;
            } else if (a % 35 == 0) {
                output = "FizzWoof";
                size = 48;
            } else if (a % 15 == 0) {
                output = "FizzBuzz";
                size = 48;
            } else if (a % 7 == 0) {
                output = "Woof";
                size = 24;
            } else if (a % 5 == 0) {
                output = "Buzz";
                size = 24;
            } else if (a % 3 == 0) {
                output = "Fizz";
                size = 24;
            } else {
                output = a + "";
            }
        }
        model.addAttribute("output", output);
        model.addAttribute("size", size);
        return "fbw";
    }
}
