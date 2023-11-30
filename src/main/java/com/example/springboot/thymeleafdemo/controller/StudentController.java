package com.example.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.thymeleafdemo.model.Student;

@Controller
public class StudentController {

    @GetMapping("/studentForm")
    public String studentForm(Model model) {
        Student theStudent = new Student();
        model.addAttribute("student", theStudent);
        return "studentForm";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent) {

        return "processStudentForm";
    }
}
