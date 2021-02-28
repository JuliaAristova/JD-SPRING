package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium  implements Course {
    @Override
    public void getTechingHours() {
        System.out.println("Selenium weekly teachinh hours: 10 ");
    }
}
