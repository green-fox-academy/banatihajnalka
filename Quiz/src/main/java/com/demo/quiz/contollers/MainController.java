package com.demo.quiz.contollers;

import com.demo.quiz.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private QuestionService questionService;

    @Autowired
    public MainController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }
}
