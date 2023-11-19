package com.example.bootview.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootview.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
