package com.example.RestApiDemo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiDemo.UserNotFoundException;
import com.example.RestApiDemo.data.StudentDataService;
import com.example.RestApiDemo.model.Student;

@RestController
public class StudentController {
	private StudentDataService service;
	
	public StudentController(StudentDataService service) {
		super();
		this.service = service;
	}


	
/// All The Students Stored in the databasse---/students
	@GetMapping("/students")
	public List<Student>  getAllStudents() {
		return service.reteriveAll();
	}
	// find the Specific user with specific id given in the url
	@GetMapping("/students/{id}")
	public Student  getStudent(@PathVariable int id) {
		Student student = service.reteriveStudent(id);
		if(student == null) {
			throw new UserNotFoundException("User Not Found");
		}
		return student;
	}
	// request : localhost:9090/students
	// response : localhost:9090/students/104
	@PostMapping("/students")
	public ResponseEntity<Student>  setStudent(@RequestBody Student student) {
		return service.storeStudent(student);
	}
	@DeleteMapping("students/{id}")
	public void  deleteStudent(@PathVariable int id) {
		 service.deleteStudentById(id);
	}
}
