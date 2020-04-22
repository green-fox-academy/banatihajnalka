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
public class MainControllerWithUser {

    private FoxService foxService;
    private UserService userService;

    @Autowired
    public MainControllerWithUser(FoxService foxService, UserService userService) {
        this.foxService = foxService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String showMain(Model model, @RequestParam(required = false) String username) {
        if (username == null) {
            return "login_with_user";
        } else if (!(userService.isExistsByName(username))) {
            return "login_with_user";
        } else {
            model.addAttribute("user", userService.findByName(username));
            model.addAttribute("fox", userService.findUsersFox(username));
            model.addAttribute("toString", userService.findUsersFox(username).toString());
            model.addAttribute("numOfTricks", userService.findUsersFox(username).numberOfTricks());
            model.addAttribute("tricks", userService.findUsersFox(username).getTricks());
            model.addAttribute("actions", userService.findUsersFox(username).isActionListIsEmpty() ? "There was no action yet." : userService.findUsersFox(username).getLatestFiveActions());
//            model.addAttribute("active", "index");
//            model.addAttribute("actions", foxService.find(name).getActions());
//            model.addAttribute("numOfActions", foxService.find(name).numberOfActions());
        }
        return "index_with_user";
    }

    @GetMapping("/login")
    public String renderMain() {
        return "login_with_user";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (!userService.isExistsByName(username)) {
            model.addAttribute("error", "Invalid username");
            return "login_with_user";
        } else if (!userService.isValidUser(username, password)) {
            model.addAttribute("error", "Username and password do not match");
            return "login_with_user";
        } else {
            return "redirect:/?username=" + username;
        }
    }
}
