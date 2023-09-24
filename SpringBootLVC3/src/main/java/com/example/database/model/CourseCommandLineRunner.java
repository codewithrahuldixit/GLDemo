package com.example.database.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	CourseRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(101,"Spring Boot","Rahul"));
		System.out.println(repository.findById(101));		
		
	}

}
