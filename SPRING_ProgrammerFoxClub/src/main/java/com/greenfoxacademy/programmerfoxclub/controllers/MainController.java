package com.greenfoxacademy.programmerfoxclub.controllers;

        import com.greenfoxacademy.programmerfoxclub.modles.Fox;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private Fox fox;

    public MainController(){
        this.fox = new Fox();
    }

    @GetMapping("/")
    public String showMain() {
        return "index";
    }

    @GetMapping("/login")
    public String renderMain() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name) {
        return "redirect:/?name=" + name;
    }
}
