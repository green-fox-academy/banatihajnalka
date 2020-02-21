package com.greenfoxacademy.dependencies.greenfoxclass.controllers;

import com.greenfoxacademy.dependencies.greenfoxclass.sevices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxClassController {

    private StudentService studentService;

    @Autowired
    public GreenFoxClassController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String showLinks() {
        return "gFCLinks";
    }

    @GetMapping("/gfa/list")
    public String listStudents() {
        return "gFCLinks";
    }
}
