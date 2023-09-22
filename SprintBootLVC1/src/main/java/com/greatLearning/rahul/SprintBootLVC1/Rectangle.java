package com.greatLearning.rahul.SprintBootLVC1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Rectangle implements Shape{
	private int length ;
	private int breath;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	} 

}
