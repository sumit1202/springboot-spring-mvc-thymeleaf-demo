package com.example.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldCotnroller {

    @GetMapping("/form")
    public String showForm() {
        return "helloworld-form";
    }

    @GetMapping("/display")
    public String processForm() {
        return "helloworld-process-form";
    }

    @GetMapping("/displayincaps")
    public String processFormInCaps(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        String result = "YO! " + theName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld-process-form-in-caps";
    }
}
