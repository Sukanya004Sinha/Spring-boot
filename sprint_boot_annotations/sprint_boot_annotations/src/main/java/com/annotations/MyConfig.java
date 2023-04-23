package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;


@Configuration
public class MyConfig {
    @Bean
    public Student getStudent(){
        System.out.println("Creating student object");
        return  new Student();  // above bean annotation wil tell one bean is returning from here
    }
    @Bean
    public Date getDate(){
        System.out.println("Creating new Date");
        return new Date();

    }

}
