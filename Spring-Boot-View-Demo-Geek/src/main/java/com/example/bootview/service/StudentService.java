package com.example.bootview.service;

import java.util.List;

import com.example.bootview.model.Student;

public interface StudentService {	
		List<Student> getAllStudent();
		void save(Student student);
		Student getById(Long id);
		void deleteViaId(long id);
	}


