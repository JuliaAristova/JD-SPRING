package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.Setter;

@Setter
public class Selenium implements Course {

    ExtraSessions extraSessions;

    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: " + (16 + extraSessions.getHours()));
    }
}
