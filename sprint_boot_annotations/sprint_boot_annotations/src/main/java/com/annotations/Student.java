package com.annotations;

public class Student {
    String name ;
    public Student() {

    }
    public Student (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void studying() {
        System.out.println(this.name+ " am studying");
    }


    public void setName(String name) {
        this.name = name;
    }
}
