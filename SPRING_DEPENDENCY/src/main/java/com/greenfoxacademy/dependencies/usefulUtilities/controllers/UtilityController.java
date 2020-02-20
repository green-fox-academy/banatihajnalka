package com.greenfoxacademy.dependencies.usefulUtilities.controllers;

import com.greenfoxacademy.dependencies.usefulUtilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
        public String showLinks() {
        return "links";
    }

    @GetMapping("/useful/colored")
    public String backGroundColor(Model model) {
        String randomColor = utilityService.randomColor();
        model.addAttribute("color", randomColor);
        return "backGroundColor";
    }

}
