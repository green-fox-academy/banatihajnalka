package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showMain(Model model, @RequestParam(required = false) String username) {
        if (username == null) {
            return "login";
        } else if (!(userService.userIsExistsByName(username))) {
            return "register";
        }
        return "api";
    }
}
