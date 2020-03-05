package com.demo.quiz.contollers;

import com.demo.quiz.services.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

   private QuestionService questionService;

    public MainController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("question", questionService.findByIsUsed());
        return "question";
    }
}

//    @RequestMapping(value = "/test.html", method = RequestMethod.GET)
//    public String test() {
//        return "redirect:index.html#test";
//    }
//