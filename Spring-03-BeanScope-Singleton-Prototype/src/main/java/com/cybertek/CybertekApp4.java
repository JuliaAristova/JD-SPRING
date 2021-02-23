package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp4 {

    public static void main(String[] args) {

       ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java", Course.class);
        Course course2 = container.getBean("java", Course.class);

        //we created 2 objects --> pointing to the same object
        System.out.println("Pointing to the same object: " + (course1==course2));
        System.out.println("Memory location for the course1: " + course1);
        System.out.println("Memory location for the course2: " + course2);
    }
}
