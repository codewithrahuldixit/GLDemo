package com.example.restwithdatabase.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restwithdatabase.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
 public List<Course> findByMentor(String mentor);
}
