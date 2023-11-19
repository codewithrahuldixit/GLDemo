package com.example.RestApiDemo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApiDemo.model.Student;

public interface StudentRepository extends  JpaRepository<Student, Integer> {

}
