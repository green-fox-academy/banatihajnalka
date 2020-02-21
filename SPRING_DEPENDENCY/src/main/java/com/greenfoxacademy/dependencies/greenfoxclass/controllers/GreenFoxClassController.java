package com.greenfoxacademy.dependencies.greenfoxclass.controllers;

import com.greenfoxacademy.dependencies.greenfoxclass.sevices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxClassController {

    private StudentService studentService;

    @Autowired
    public GreenFoxClassController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String showLinks(Model model) {
        model.addAttribute("counter", studentService.count());
        return "greenfoxclass/links";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "greenfoxclass/student_list";
    }

    @GetMapping("/gfa/add")
    public String addStudent() {
        return "greenfoxclass/add";
    }

    @PostMapping("/gfa/save")
    public String addStudent(String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }
}
