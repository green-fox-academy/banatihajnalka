package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/test/login")
public class LoginController {

    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String renderLoginPage() {
        return "login";
    }

    @PostMapping
    public String login(@RequestParam String userName, @RequestParam String password, Model model) {
        if (!userService.userIsExistsByName(userName)) {
            model.addAttribute("error", "Invalid username");
            return "api";
        } else if (!userService.isValidUser(userName, password)) {
            model.addAttribute("error", "Username and password do not match");
            return "api";
        } else {
            return "redirect:/?username=" + userName;
        }
    }
}
