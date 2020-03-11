package com.database.mysql.controllers;

import com.database.mysql.services.AssigneeService;
import com.database.mysql.services.ToDoService;
import com.database.mysql.models.entities.ToDo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;
    private AssigneeService assigneeService;

    public ToDoController(ToDoService toDoService, AssigneeService assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive, @RequestParam(required = false) String title) {
        if (title != null) {
            model.addAttribute("todos", toDoService.findAllByTitleContains(title));
        } else if (isActive == null) {
            model.addAttribute("todos", toDoService.findAll());
        } else if (isActive.equals("true")) {
            model.addAttribute("todos", toDoService.findAllActive());
        } else if (isActive.equals("false")) {
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

    @GetMapping("/{id}/delete")
    public String add(@PathVariable Long id) {
        toDoService.deleteToDoById(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String renderEditPage(@PathVariable Long id, Model model) {
        model.addAttribute("todo", toDoService.findById(id));
        model.addAttribute("assignees", assigneeService.findAll());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodoById(@PathVariable Long id, @ModelAttribute ToDo todo, Model model) {
        model.addAttribute("todo", toDoService.findById(id));
        toDoService.addToDo(todo);
        assigneeService.addToDo(todo);
        return "redirect:/todo/";
    }
}

//    @PostMapping("/{id}/edit")
//    public String editTodoById(@PathVariable Long id, @ModelAttribute ToDoDTO toDoDTO, Model model) {
//        model.addAttribute("todo", toDoService.findById(id));
//        toDoService.addToDo(todo);
//        return "redirect:/todo/";
//    }