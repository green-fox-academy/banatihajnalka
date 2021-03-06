package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;
import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
@RequestMapping("register")
public class RegisterController {

    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    private String renderRegisterPage(Model model, @ModelAttribute UserDTO userDTO) {
        model.addAttribute("user", userDTO);
        return "register";
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") @Valid UserDTO userDTO, RedirectAttributes redirect) {
        if (!userService.userIsExistsByName(userDTO.getUserName()) && !userService.userIsExistsByEmail(userDTO.getEmail())) {
//                userService.arePasswordsMatching(userDTO.getPassword(), userDTO.getMatchingPassword()) )) {
            userService.save(userDTO);
            return "login";
        } else {
            redirect.addFlashAttribute("user", userDTO);
            redirect.addFlashAttribute("error", "Username/email already exists");
            return "redirect:/";
        }
    }
}
