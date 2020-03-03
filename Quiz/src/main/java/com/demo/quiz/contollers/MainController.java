package com.demo.quiz.contollers;

import com.demo.quiz.repositories.QuestionRepository;
import com.demo.quiz.services.QuestionService;
import com.demo.quiz.services.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
        model.addAttribute("questions", questionService.getRandomQuestion());
        return "questionlist";
    }
}
