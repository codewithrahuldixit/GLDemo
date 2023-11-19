package com.example.microservice;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class StudentDataService {

	private StudentRepository repository;
	static int sid=100;
	public StudentDataService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(++sid,"Rahul","rahul@gmail.com"));
		repository.save(new Student(++sid,"Shikha","Shikha@gmail.com"));
		repository.save(new Student(++sid,"Viraj","Viraj@gmail.com"));
		repository.save(new Student(++sid,"Sonal","Sonal@gmail.com"));
	}
	public List<Student> reteriveAll() {
		return repository.findAll();
	}
	public Student reteriveStudent(int id) {
		Student student;
		try {
		 student = repository.findById(id).get();
		}
		catch (Exception e) {
			student = null;
		}
		return student;
	}
	public ResponseEntity<Student> storeStudent(Student student) {
		student.setId(++sid);
		repository.save(student);
		URI location = ServletUriComponentsBuilder
				//localhost:9090/students/104
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(student.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	public void deleteStudentById(int id) {
		repository.deleteById(id);
		
	}
	
}
