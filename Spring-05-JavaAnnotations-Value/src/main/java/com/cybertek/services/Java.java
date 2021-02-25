package com.cybertek.services;

//QUALIFIER inside the CONSTRUCTOR
import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("JD1")                  //hardcoding
    private String batch;

    @Value("${instructor}")         //Spring will look at properties file
    private String instructor;

    @Value("${days}")
    private String days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days='" + days + '\'' +
                '}';
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teahing hours: 25");
    }
}
