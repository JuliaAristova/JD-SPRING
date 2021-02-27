package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;


public class API implements Course {

    private ExtraSessions extraSessions;

    public API(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachinghours() {
        System.out.println("API weekly teaching hours: " + (10 + extraSessions.getHours()));
    }
}
