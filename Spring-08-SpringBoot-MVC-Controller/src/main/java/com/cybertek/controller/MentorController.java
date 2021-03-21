package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8080/mentor/show
@Controller
@RequestMapping("/mentor")
public class MentorController {

    //FC scans all classes
    @RequestMapping("/show")
    public String showForm() {
        return "home";
    }
}
