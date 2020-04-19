package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public String renderRegisterPage(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(Model model, @RequestParam String username, @RequestParam String password, @RequestParam String password2) {
        if (userService.isExistsByName(username)) {
            model.addAttribute("error", "Username already exists");
            return "register";
        }
        if (!password.equals(password2)) {
            model.addAttribute("error", "Passwords do not match");
            return "register";
        }
        userService.registerUser(username, password);
        return "login";
    }
}
