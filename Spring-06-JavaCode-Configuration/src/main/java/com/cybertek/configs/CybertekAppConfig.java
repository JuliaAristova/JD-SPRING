package com.cybertek.configs;
/*
add 2 annotations
Config - to make it config file
ComponentScan - indicate what package to scan
 */
import com.cybertek.services.API;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

    //just try to use instead of @Component in Selenium class
    @Bean
    public Selenium selenium() { return new Selenium(); }

    //need to provide argument to constructor - we pass officeHours() method it returns object, we cannot pass extrasessions-**+-----------------
    @Bean
    public API api() {return new API(officeHours());}

    @Bean
    public OfficeHours officeHours() {return new OfficeHours();}
}
