package com.cybertek.services;
//SETTER INJECTION

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    private ExtraSessions extraSessions;

    @Autowired
    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("API weekly teaching hours: " + (8 + extraSessions.getHours()));
    }
}
