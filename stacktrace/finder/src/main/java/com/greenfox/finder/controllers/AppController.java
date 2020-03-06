package com.greenfox.finder.controllers;

import com.greenfox.finder.services.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.greenfox.finder.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    private UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/";
    }
}