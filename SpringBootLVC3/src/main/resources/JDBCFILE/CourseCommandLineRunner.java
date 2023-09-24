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
		
		repository.save(new Course(1,"SpringBoot","Rahul"));
		repository.save(new Course(2,"Spring Framework","Rahul"));
		repository.save(new Course(3,"Full Stack","Rahul"));
		repository.save(new Course(4,"Css","Rahul"));
		repository.save(new Course(5,"Angular","Rahul"));
		System.out.println(repository.findById(3));
		repository.deleteById(2);
		System.out.println(repository.findAll());
	}

}
