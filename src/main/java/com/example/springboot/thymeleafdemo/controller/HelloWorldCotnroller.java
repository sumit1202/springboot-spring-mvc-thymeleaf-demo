package com.example.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/displayincaps1")
    public String processFormInCaps1(HttpServletRequest request, Model model) {
        String thestudentName = request.getParameter("studentName");
        String result = "YO! " + thestudentName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld-process-form-in-caps";
    }

    @GetMapping("/displayincaps2")
    public String processFormInCaps2(@RequestParam("studentName") String thestudentName, Model model) {
        String result = "YO! " + thestudentName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld-process-form-in-caps";
    }
}
