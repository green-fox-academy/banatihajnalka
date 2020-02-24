package com.greenfoxacademy.programmerfoxclub.controllers;

        import com.greenfoxacademy.programmerfoxclub.modles.Fox;
        import com.greenfoxacademy.programmerfoxclub.services.FoxService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;


    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String showMain(Model model, @RequestParam String name) {
        model.addAttribute("name", foxService.find(name).toString());
        model.addAttribute("numOfTricks", foxService.find(name).getNumberOfTricks());
        return "index";
    }

    @GetMapping("/login")
    public String renderMain(@RequestParam (required=false) String name, Model model) {
        model.addAttribute("name", foxService.isExists(name) ? "" : "You have provided a name that has not been used before, add it as a new one!");
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, Model model) {
        if (foxService.isExists(name)) {
            return "redirect:/?name=" + name;
        } else {
            foxService.add(name);
            return "redirect:/login";
        }
    }
}
