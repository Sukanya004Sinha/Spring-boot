package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SprintBootAnnotationsApplication implements CommandLineRunner {

@Autowired
private Student student;

@Autowired
private Date date;
@Autowired
private Emp emp;

	public static void main(String[] args) {

		SpringApplication.run(SprintBootAnnotationsApplication.class, args);
	}
	@Override
	public void run(String... args) throws  Exception {
		this.student.studying();
	}

}
