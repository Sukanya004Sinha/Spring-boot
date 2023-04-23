package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@ComponentScan (basePackages = {"MyPack"})
@Configuration
public class MyConfig {
    @Bean("student1")
    @Lazy
    public Student getStudent(){
        System.out.println("Creating student object");
        return  new Student("student1");  // above bean annotation wil tell one bean is returning from here
    }
    @Bean("student2")
    @Lazy
    public Student creatingSecondStudent(){
        System.out.println("Creating second student");
        return new Student("student2");
    }
    @Bean
    public Date getDate(){
        System.out.println("Creating new Date");
        return new Date();

    }

}
