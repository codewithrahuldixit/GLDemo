package com.example.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	public void insert(Course course) {
		repository.save(course);
	}
	
	public List<Course> getAllCourses(){
		return repository.findAll();
	}
	public Course getById(int id){
		return repository.findById(id).get();
	}
	public List<Course> getByMentor(String mentor){
		return repository.findByMentor(mentor);
	}
	
	
}
