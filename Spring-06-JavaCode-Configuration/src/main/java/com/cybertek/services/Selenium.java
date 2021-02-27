package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Selenium implements Course {
    public void getTeachinghours() {
        System.out.println("Selenium weekly teaching hours: 20");
    }


}
