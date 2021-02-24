package com.cybertek.services;
//FIELD INJECTION, QUALIFIER above the field

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Autowired
    @Qualifier("officeHours")
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teachin hours: " +(16+ extraSessions.getHours()));
    }
}
