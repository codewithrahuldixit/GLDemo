package com.greatLearning.rahul.SprintBootLVC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class Drawing {
	//Field Injection 
	@Autowired
	@Qualifier("Circle")
	private Shape shape;

	@PostConstruct
	void initialize() {
		System.out.println("Initialization after construction");
	}
	@PreDestroy
	void cleanUpActivity() {
		System.out.println("Initialization after construction");
	}
	//By Default the Injection is done through constructors 
	
	public Drawing(Shape shape) {
		super();
		this.shape = shape;
		System.out.println("Constructor Injection");
	}

	public Shape  getCircle() {
		return shape;
	}
//Setter Injection
	//@Autowired
	public void setCircle(Shape circle) {
		this.shape = shape;
		System.out.println("Setter Injection");
	}

	@Override
	public String toString() {
		return "Drawing [shape=" + shape + "]";
	}

	public void draw() {
	System.out.println("Draw "+shape);
		
	}
	
}
