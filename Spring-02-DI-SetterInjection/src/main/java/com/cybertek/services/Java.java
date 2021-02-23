package com.cybertek.services;

/*
Alt Insert - shortcut
Create Setter

 */
import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    private ExtraSessions extraSessions;

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {

    System.out.println("Java weekly teaching hours: " + (20 + extraSessions.getHours()));

    }
}
