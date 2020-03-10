package com.database.mysql.controllers;

import com.database.mysql.models.Assignee;
import com.database.mysql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    private AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assignees")
    public String renderAssigneesPage(Model model) {
        model.addAttribute("assignee", new Assignee());
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignees";
    }

    @PostMapping("/assignee/add")
    public String addAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.addAssignee(assignee);
        return "redirect:/todo/assignees";
    }

    @PostMapping("/assignee/{id}/delete")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeService.deleteAssigneeById(id);
        return "redirect:/todo/assignees";
    }


    @PostMapping("/assignee/{id}/edit")
    public String editAssignee(@PathVariable Long id, @ModelAttribute Assignee assignee) {
        assigneeService.editAssigneeById(id, assignee);
        return "redirect:/todo/assignees";
    }

}
