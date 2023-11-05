package com.example.microservice;

import java.util.List;

public class Mentor {
private int id;
private String mname;
private int noofcourse;
private List<Course> course;

public Mentor() {
	super();
	// TODO Auto-generated constructor stub
}

public Mentor(int id, String mname, int noofcourse, List<Course> course) {
	super();
	this.id = id;
	this.mname = mname;
	this.noofcourse = noofcourse;
	this.course = course;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public int getNoofcourse() {
	return noofcourse;
}

public void setNoofcourse(int noofcourse) {
	this.noofcourse = noofcourse;
}

public List<Course> getCourse() {
	return course;
}

public void setCourse(List<Course> course) {
	this.course = course;
}

@Override
public String toString() {
	return "Mentor [id=" + id + ", mname=" + mname + ", noofcourse=" + noofcourse + ", course=" + course + "]";
}


}
