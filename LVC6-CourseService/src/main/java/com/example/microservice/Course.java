package com.example.microservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String cname;
	private String mentor;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String cname, String mentor) {
		super();
		this.id = id;
		this.cname = cname;
		this.mentor = mentor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", mentor=" + mentor + "]";
	}
	
	

}
