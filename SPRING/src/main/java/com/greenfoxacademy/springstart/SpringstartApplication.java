package com.greenfoxacademy.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
