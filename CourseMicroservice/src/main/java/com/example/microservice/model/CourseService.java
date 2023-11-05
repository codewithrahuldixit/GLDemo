package com.example.microservice.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	private static int cid=100;
	private CourseRepository repository;
	public CourseService(CourseRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Course(++cid,"Core Java","RAHUL"));
		repository.save(new Course(++cid,"Spring Boot","RAHUL"));
		repository.save(new Course(++cid,"Micro Services","RAHUL"));
		repository.save(new Course(++cid,"C","AMAN"));
		repository.save(new Course(++cid,"C++","PIYUSH"));
		
	}
	
	public List<Course> getAll() {
		return repository.findAll();
	}
	
	public List<Course> getByName(String mentor) {
		System.out.println(repository.findByMentor(mentor));
		return repository.findByMentor(mentor);
	}
	
	
}
