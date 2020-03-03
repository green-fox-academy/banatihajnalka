package com.database.mysql.controllers;

import com.database.mysql.ToDoService;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping(value = {"/", "/list"})
    public String list( Model model, @RequestParam (required = false) String isActive) {
        if (isActive == null) {
            model.addAttribute("todos", toDoService.findAll());
        } else if (isActive.equals("true")) {
            model.addAttribute("todos", toDoService.findAllActive());
        } else {
            model.addAttribute("todos", toDoService.findAllNotActive());
        }
        return "todolist";
    }


}