package com.demo.quiz.contollers;

import com.demo.quiz.models.entities.Question;
import com.demo.quiz.services.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String renderQuiz(Model model) {
        model.addAttribute("question", questionService.findByIsUsed());
        return "question2";
    }

    @PostMapping("/list")
    public String list(Model model, @ModelAttribute Question question) {
        model.addAttribute("question", questionService.findByIsUsed());
        questionService.addAnswer(question);
        return "login";
    }
}

//    @RequestMapping(value = "/test.html", method = RequestMethod.GET)
//    public String test() {
//        return "redirect:index.html#test";
//    }
//