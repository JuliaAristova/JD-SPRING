package com.cybertek.services;

//QUALIFIER inside the CONSTRUCTOR
import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


    private ExtraSessions extraSessions;

    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teahing hours: " + (25 + extraSessions.getHours()));
    }
}
