package com.example.microservice;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

	private static int cid=100;
	private CourseRepository repository;

	public CourseService(CourseRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Course(++cid,"Spring Boot","RAHUL"));
		repository.save(new Course(++cid,"Core Java","RAHUL"));
		repository.save(new Course(++cid,"DSA","RAHUL"));
		repository.save(new Course(++cid,"C","AMAN"));
		repository.save(new Course(++cid,"C++","AMAN"));
	}
	public List<Course> getAllCourses(){
		return repository.findAll();
	}
	
	public List<Course> getAllByMentor(String mentor){
		return repository.findByMentor(mentor);
	}
	
	
}
