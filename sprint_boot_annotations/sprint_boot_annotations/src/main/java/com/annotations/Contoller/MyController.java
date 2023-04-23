package com.annotations.Contoller;

import com.annotations.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
    @Autowired
    @Qualifier("student1")
    private Student student;
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
            public Student home(@RequestBody Student st){
   // public String home(){
      st.studying();
        System.out.println("this is home method");
       // return "this is my name";
        this.student.setName("Sparm loves Sukanya");
        return this.student;
    }
}

