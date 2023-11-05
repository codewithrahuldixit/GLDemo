package com.example.microservice;

import java.util.List;

public class Mentor {
	private int id;
	private String mname;
	private int numberofcourses;
	private List<Course> courses;
	

	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mentor(int id, String mname, int numberofcourses, List<Course> courses) {
		super();
		this.id = id;
		this.mname = mname;
		this.numberofcourses = numberofcourses;
		this.courses = courses;
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

	public int getNumberofcourses() {
		return numberofcourses;
	}

	public void setNumberofcourses(int numberofcourses) {
		this.numberofcourses = numberofcourses;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Mentor [id=" + id + ", mname=" + mname + ", numberofcourses=" + numberofcourses + ", courses=" + courses
				+ "]";
	}

}
