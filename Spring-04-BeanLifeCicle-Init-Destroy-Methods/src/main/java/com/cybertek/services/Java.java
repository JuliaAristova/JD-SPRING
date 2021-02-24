package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: 20");
    }
    //init method: any name, no parameters
    public void myInitMethod() {
        System.out.println("Executing init method");
    }
    //destroy method
    public void myDestroyMethod() {
        System.out.println("Executing destroy method");
    }
}
