package com.example.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.CourseConfiguration;
import com.example.microservice.model.Course;
import com.example.microservice.model.CourseService;

@RestController 
@RequestMapping(value = "course-service")
public class CourseController {
	
	@Autowired
	private CourseConfiguration courseconfiguration;
	@Autowired
	private CourseService service;
	
	@GetMapping("/course")
	public Course getCourse() {
		return new Course (courseconfiguration.getId(),courseconfiguration.getName(),courseconfiguration.getMentor());
	}
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return service.getAll();
	}
	@GetMapping("/courses/{mentor}")
	public List<Course> getCourseByMentor(@PathVariable String mentor) {
		return service.getByName(mentor.toUpperCase());
	}
}
