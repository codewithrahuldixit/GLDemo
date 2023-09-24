package com.example.database;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.model.Course;

@RestController
public class RestControllerJDBC {

	@RequestMapping("/course")
	public Course getCourse() {
		return new Course();
	}
}
