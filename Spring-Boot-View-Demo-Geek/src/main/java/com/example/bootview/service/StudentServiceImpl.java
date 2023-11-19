package com.example.bootview.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootview.model.Student;

@Service

public class StudentServiceImpl implements StudentService {

		@Autowired private StudentRepository stuRepo;

		@Override public List<Student> getAllStudent()
		{
			return stuRepo.findAll();
		}

		@Override public void save(Student student)
		{
			stuRepo.save(student);
		}

		@Override public Student getById(Long id)
		{
			Optional<Student> optional = stuRepo.findById(id);
			Student student = null;
			if (optional.isPresent())
				student = optional.get();
			else
				throw new RuntimeException(
					"Student not found for id : " + id);
			return student;
		}

		@Override public void deleteViaId(long id)
		{
			stuRepo.deleteById(id);
		}

		
	}

