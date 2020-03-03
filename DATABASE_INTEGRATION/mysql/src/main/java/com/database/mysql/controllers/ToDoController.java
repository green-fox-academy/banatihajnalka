package com.database.mysql.controllers;

import com.database.mysql.repositories.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoRepository repository;

    public ToDoController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repository.findAll());
        return "todolist";
    }


}