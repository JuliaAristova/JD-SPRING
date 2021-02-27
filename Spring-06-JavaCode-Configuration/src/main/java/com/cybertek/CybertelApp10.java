package com.cybertek;

import com.cybertek.configs.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertelApp10 {
    public static void main(String[] args) {

        //we create a container, provide config class
        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course = container.getBean("java", Course.class);
        course.getTeachinghours();

        System.out.println(course.toString());
        Course course2 = container.getBean("selenium", Course.class);
        course2.getTeachinghours();
    }
}
