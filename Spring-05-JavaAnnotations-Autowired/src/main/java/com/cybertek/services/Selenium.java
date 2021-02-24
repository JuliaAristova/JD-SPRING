package com.cybertek.services;
//CONSTRUCTOR injection with Lombok

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Selenium implements Course {

    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: " + (10 + extraSessions.getHours()));
    }
}
