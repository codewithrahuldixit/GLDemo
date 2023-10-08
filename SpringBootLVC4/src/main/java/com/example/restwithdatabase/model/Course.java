package com.example.restwithdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
private int id;
private String name;
private String mentor;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int id, String name, String mentor) {
	super();
	this.id = id;
	this.name = name;
	this.mentor = mentor;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", mentor=" + mentor + "]";
}

}
