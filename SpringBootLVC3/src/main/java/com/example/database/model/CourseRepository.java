package com.example.database.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class CourseRepository {

		@Autowired
		private EntityManager entityManager;
	
	public void save(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class,id);
	}
	
	
}
