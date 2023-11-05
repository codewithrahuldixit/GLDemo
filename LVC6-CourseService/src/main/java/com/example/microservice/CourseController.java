package com.example.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "course-service")
public class CourseController {
	@Autowired
	private CourseService service;
	@Autowired
	private CourseConfiguration courseconfig;
	@GetMapping("/course")
	public Course getCourse() {
		return new Course(courseconfig.getId(),courseconfig.getCname(),courseconfig.getMentor());
	}
	@GetMapping("/courses")
	public List<Course> getAllCourse() {
		return service.getAllCourses();
	}
	//http://localhost:8080/course-service/courses/{mentor}
	@GetMapping("/courses/{mentor}")
	public List<Course> getAllMentorDetails(@PathVariable String mentor) {
		return service.getAllByMentor(mentor.toUpperCase());
	}
}
