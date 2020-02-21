package com.greenfoxacademy.dependencies.usefulUtilities.controllers;

import com.greenfoxacademy.dependencies.usefulUtilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String showLinks() {
        return "utilities/links";
    }

    @GetMapping("/useful/colored")
    public String backGroundColor(Model model) {
        String randomColor = utilityService.randomColor();
        model.addAttribute("color", randomColor);
        return "utilities/background_color";
    }

//    @GetMapping("/useful/email")
//    public String renderValidatePage() {
//        return "email_validation";
//    }

    @GetMapping("/useful/email")
    public String validateEmail(Model model, @RequestParam(name = "email", required = false) String email) {
        model.addAttribute("email", email);
        model.addAttribute("isValid", utilityService.validateEmail("email"));
        return "utilities/email_validation";
    }

    @PostMapping("/useful/email")
    public String validatePostedEmail(Model model, @RequestParam(name = "email") String email) {
        model.addAttribute("email", email);
        model.addAttribute("isValid", utilityService.validateEmail("email"));
        return "utilities/email_validation";
    }


    @GetMapping("/encode")
    public String showEncodeFields() {
        return "utilities/encode";
    }

    @PostMapping("/encode")
    public String encode(Model model, @RequestParam("text") String text, @RequestParam ("number") int number) {
        model.addAttribute("encode", utilityService.caesar(text, number));
        return "utilities/encode";
    }

    @GetMapping("/decode")
    public String showDecodeFields() {
        return "utilities/decode";
    }

    @PostMapping("/decode")
    public String decode(Model model, @RequestParam("text") String text, @RequestParam ("number") int number) {
        model.addAttribute("decode", utilityService.caesar(text, -number));
        return "decode";
    }

}

