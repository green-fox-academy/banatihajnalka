package com.demo.quiz.contollers;

import com.demo.quiz.models.entities.User;
import com.demo.quiz.services.QuestionService;
import com.demo.quiz.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private QuestionService questionService;
    private UserService userService;

    public MainController(QuestionService questionService, UserService userService) {
        this.questionService = questionService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String showMain(Model model, @RequestParam(required = false) String name) {
        if (name == null) {
            return "login";
         } else if (!userService.isExists(name)) {
            return "login";
        } else {
            model.addAttribute("user", userService.find(name));
//            model.addAttribute("toString", userService.find(name).toString());
//            model.addAttribute("numOfTricks", foxService.find(name).numberOfTricks());
//            model.addAttribute("tricks", foxService.find(name).getTricks());
//            model.addAttribute("actions", foxService.find(name).isActionListIsEmpty() ? "There was no action yet." : foxService.find(name).getLatestFiveActions());
//            model.addAttribute("active", "index");
//            model.addAttribute("actions", foxService.find(name).getActions());
//            model.addAttribute("numOfActions", foxService.find(name).numberOfActions());
        }
        return "index";
    }

    @GetMapping("/login")
    public String renderLoginPage(Model model, @RequestParam(required = false) String error) {
        if (!(error == null)) {
            model.addAttribute("error", "You have provided a name that has not been used before, add it as a new one!");
        }
//        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String add(@RequestParam String name, @ModelAttribute User user) {
//        if (userService.isExists(name)) {
//            return "redirect:/?name=" + name;
//        } else {
            userService.addUser(user);
            return "redirect:/?name=" + name;
        }
    }
//
//    @PostMapping("/login")
//    public String login(@RequestParam String name, @RequestParam String password, Model model) {
//        if (userService.isExists(name, password)) {
//            return "redirect:/?name=" + name;
//        } else {
//            userService.add(name, password);
//            return "redirect:/?name=" + name;
//        }
//    }
//}

//    @GetMapping("/list")
//    public String renderQuiz(Model model) {
//        model.addAttribute("question", questionService.findByIsUsed());
//        return "question2";
//    }
//
//    @PostMapping("/list")
//    public String list(Model model, @ModelAttribute Question question) {
//        model.addAttribute("question", questionService.findByIsUsed());
//        questionService.addAnswer(question);
//        return "login";
//    }


//    @RequestMapping(value = "/test.html", method = RequestMethod.GET)
//    public String test() {
//        return "redirect:index.html#test";
//    }
//