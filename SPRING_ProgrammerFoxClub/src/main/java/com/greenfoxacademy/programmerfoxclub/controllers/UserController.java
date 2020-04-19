package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
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
    private FoxService foxService;

    @Autowired
    public UserController(UserService userService, FoxService foxService) {
        this.userService = userService;
        this.foxService = foxService;
    }

    @GetMapping("/register")
    public String renderRegisterPage(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(Model model, @RequestParam String username, @RequestParam String password, @RequestParam String password2, @RequestParam String foxname) {
        if (userService.isExistsByName(username)) {
            model.addAttribute("error", "Username already exists");
            return "register";
        }
        if (!password.equals(password2)) {
            model.addAttribute("error", "Passwords do not match");
            return "register";
        }
//        foxService.add(foxname);
        userService.registerUser(username, password, foxname);
        return "login";
    }
}
