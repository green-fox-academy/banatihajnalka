//package com.greenfoxacademy.programmerfoxclub.controllers;
//
//import com.greenfoxacademy.programmerfoxclub.services.FoxService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//
//@Controller
//public class MainController {
//
//    private FoxService foxService;
//
//    @Autowired
//    public MainController(FoxService foxService) {
//        this.foxService = foxService;
//    }
//
//    @GetMapping("/")
//    public String showMain(Model model, @RequestParam(required = false) String name) {
//        if (name == null) {
//            return "login";
//        } else if (!(foxService.isExists(name))) {
//            return "login";
//        } else {
//            model.addAttribute("fox", foxService.find(name));
//            model.addAttribute("toString", foxService.find(name).toString());
//            model.addAttribute("numOfTricks", foxService.find(name).numberOfTricks());
//            model.addAttribute("tricks", foxService.find(name).getTricks());
//            model.addAttribute("actions", foxService.find(name).isActionListIsEmpty() ? "There was no action yet." : foxService.find(name).getLatestFiveActions());
////            model.addAttribute("active", "index");
////            model.addAttribute("actions", foxService.find(name).getActions());
////            model.addAttribute("numOfActions", foxService.find(name).numberOfActions());
//        }
//        return "index";
//    }
//
//    @GetMapping("/login")
//    public String renderMain() {
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestParam String name, Model model) {
//        if (foxService.isExists(name)) {
//            return "redirect:/?name=" + name;
//        } else {
//            foxService.add(name);
//            return "redirect:/?name=\" + name";
//        }
//    }
//}
