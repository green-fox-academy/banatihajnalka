package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.models.User;
import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RestApiController {

    private UserService userService;

    @Autowired
    public RestApiController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/users")
//    ResponseEntity<String> addUser(@Valid @RequestBody User user) {
//        // persisting the user
//        return ResponseEntity.ok("User is valid");
//    }

}
