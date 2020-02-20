package com.greenfoxacademy.dependencies.HelloDI.Printer;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
        public void log(String message) {
            System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
        }
    }

