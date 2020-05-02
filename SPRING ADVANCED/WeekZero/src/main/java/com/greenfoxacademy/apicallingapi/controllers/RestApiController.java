package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestApiController {

    private UserService userService;

    @Autowired
    public RestApiController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/users/register")
//    ResponseEntity<String> addUser(@Valid @RequestBody User user) {
//        // persisting the user
//        return ResponseEntity.ok("User is valid");
//    }

}
