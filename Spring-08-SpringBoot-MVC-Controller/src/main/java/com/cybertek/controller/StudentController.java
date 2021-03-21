package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:8080/student/show
@Controller
@RequestMapping("/student")
public class StudentController {

    //FC scans all classes
    //Caused by: java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'studentController' method
    //same method and same endpoint
    //to avoid add RequestMapping on class level in both classes
    @RequestMapping("/show")
    public String showForm () {
        return "home";
    }
}
