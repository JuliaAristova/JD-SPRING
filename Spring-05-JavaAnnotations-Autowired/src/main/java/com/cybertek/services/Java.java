package com.cybertek.services;

//CONSTRUCTOR injection

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

  //  @Autowired   - optional if only one constructor


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: " + (20 + extraSessions.getHours()));
    }
}
