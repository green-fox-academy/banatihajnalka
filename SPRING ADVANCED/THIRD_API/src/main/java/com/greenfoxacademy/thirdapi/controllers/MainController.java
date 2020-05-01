package com.greenfoxacademy.thirdapi.controllers;

import com.greenfoxacademy.thirdapi.models.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class MainController {

    @GetMapping("/registration")
    private String renderRegisterForm(WebRequest request, Model model) {
        model.addAttribute("user", new UserDTO());
        return "register";
    }
}
