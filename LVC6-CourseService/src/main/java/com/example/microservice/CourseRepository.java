package com.example.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

	public List<Course> findByMentor(String mentor);

}
