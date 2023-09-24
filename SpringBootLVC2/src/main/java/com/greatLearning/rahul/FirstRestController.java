package com.greatLearning.rahul;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@Autowired 
	Student student;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World i am your First Rest Controller!!!!";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return student;
	}
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return Arrays.asList(	
				new Student(1,"Rahul"),
				new Student(2,"Paras"),
				new Student(3,"Kunal"),
				new Student(4,"Dixit"),
				new Student(5,"Shikha")
				);
			
	}
}
