package com.database.mysql.controllers;

import com.database.mysql.services.AssigneeService;
import com.database.mysql.services.ToDoService;
import com.database.mysql.models.entities.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService toDoService;
    private AssigneeService assigneeService;

    @Autowired
    public ToDoController(ToDoService toDoService, AssigneeService assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model,
                       @RequestParam(required = false) String isActive,
                       @RequestParam(required = false) String search,
                       @RequestParam(required = false, value = "key") String key) throws ParseException {
        model.addAttribute("isActive", isActive);
        if (isActive == null && search == null && key == null) {
            model.addAttribute("todos", toDoService.findAll());
        } else if (search != null && key != null) {
            model.addAttribute("todos", toDoService.searchByParam(search, key, isActive));
        } else {
            assert isActive != null;
            model.addAttribute("todos", toDoService.findActiveOrNot(isActive));
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
    public String editTodoById(@PathVariable Long id,  @ModelAttribute("assignee") Long assigneeId, @ModelAttribute ToDo todo) {
            toDoService.editTodo(id, assigneeId, todo);
            return "redirect:/todo/";
    }
}

//    @PostMapping("/{id}/edit")
//    public String editTodoById(@PathVariable Long id, @ModelAttribute ToDo todo, Model model) {
//        model.addAttribute("todo", toDoService.findById(id));
//        toDoService.addToDo(todo);
//        assigneeService.addToDo(todo);
//        return "redirect:/todo/";
//    }
//}

//    @PostMapping("/{id}/edit")
//    public String editTodoById(@PathVariable Long id, @ModelAttribute ToDoDTO toDoDTO, Model model) {
//        model.addAttribute("todo", toDoService.findById(id));
//        toDoService.saveToDO(toDoDTO);
//        return "redirect:/todo/";
//    }
//}