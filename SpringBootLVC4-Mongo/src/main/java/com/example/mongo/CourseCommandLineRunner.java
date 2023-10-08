package com.example.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	CourseService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.insert(new Course(101,"Spring Boot","Rahul"));
		service.insert(new Course(102,"Spring Rest Api","Rahul"));
		service.insert(new Course(102,"Spring Rest Api","Aman"));
		System.out.println(service.getByMentor("Aman"));
	}

}
