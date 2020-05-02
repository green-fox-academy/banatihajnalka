package com.greenfoxacademy.thirdapi.controllers;

import com.greenfoxacademy.thirdapi.models.UserDTO;
import com.greenfoxacademy.thirdapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class RegisterController {

    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/register")
    private String renderRegisterForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "register";
    }


}
