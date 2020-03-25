package com.spring.reddit.controllers;

import com.spring.reddit.models.User;
import com.spring.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String renderRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.add(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String userName, String password) {
        if (userService.isExistsByUserNameAndPassword(userName, password)) {
            return "redirect:/?userName=" + userName;
        } else {
            return "redirect:/login";
        }
    }

}
