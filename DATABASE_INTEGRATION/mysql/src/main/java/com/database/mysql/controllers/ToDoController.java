package com.database.mysql.controllers;

import com.database.mysql.ToDoService;
import com.database.mysql.models.ToDo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String renderAddPage(Model model) {
        model.addAttribute("todo", new ToDo());
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute ToDo todo) {
        toDoService.addToDo(todo);
        return "redirect:/todo/list";
    }



}