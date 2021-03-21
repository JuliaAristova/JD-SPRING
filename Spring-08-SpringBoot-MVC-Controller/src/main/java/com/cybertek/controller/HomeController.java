package com.cybertek.controller;
/*
Controller business logic.Controller - one of Component's type
Spring will create objects
1. Send your Request  to Front Controller (localhost:8080)
2. Front Controller looks for @Controller - > methos with the Request Parameter("/")

For UI design - 2 methods are used - GET (to retrieve)  and POST (to send; fill a form and save)
Annotation is on method level
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping
    //by default it means @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")
    //by default it means @RequestMapping("/")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cybertek")
    //by default it means @RequestMapping("/")
    public String getRequestMapping3(){
        return "home";
    }

     @GetMapping("/spring")
    //by default it means @RequestMapping("/")
    public String getRequestMapping4(){
        return "home";
    }

    @PostMapping( "/spring")
    //by default it means @RequestMapping("/")
    public String getRequestMapping5(){
        return "home";
    }


    //path parameter
    @GetMapping("/home/{name}")
    public String pathVariableExample(@PathVariable("name") String name){
        System.out.println("Name is: " + name);
        return "home";
    }
    @GetMapping("/home/{name}/{email}")
    public String pathVariableExample2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("Name is: " + name + ", email is: " + email);
        return "home";
    }


    //request parameter  http://localhost:8080/home/course?course=java
    @GetMapping("/home/course")
    public String requestParamExample(@RequestParam("course") String course){
        System.out.println("Course is: " + course);
        return "home";
    }

    //http://localhost:8080/home/course2?course2=Selenium
    @GetMapping(value = "/home/course2")
    public String requestParamExample2(@RequestParam(value = "course2", required = false, defaultValue = "Cybertek") String name){
        System.out.println("Course name is: " + name);
        return "home";
    }


}
