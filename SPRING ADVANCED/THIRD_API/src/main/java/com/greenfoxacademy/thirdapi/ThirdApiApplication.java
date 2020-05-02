package com.greenfoxacademy.thirdapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
        (exclude = { SecurityAutoConfiguration.class })
public class ThirdApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdApiApplication.class, args);
    }

}
