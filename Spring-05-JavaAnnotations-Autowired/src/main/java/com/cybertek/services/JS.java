package com.cybertek.services;
//FIELD INJECTION

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JS implements Course {

    @Autowired
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("JS weekly teaching hours: " + (9 + extraSessions.getHours()) );
    }
}
