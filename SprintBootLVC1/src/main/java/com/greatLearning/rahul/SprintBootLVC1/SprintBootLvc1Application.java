package com.greatLearning.rahul.SprintBootLVC1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.greatLearning.rahul")
public class SprintBootLvc1Application {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(SprintBootLvc1Application.class);
		System.out.println("Application Started ");
		System.out.println(context.getBean(Drawing.class).hashCode());
		System.out.println(context.getBean(Drawing.class).hashCode());
		System.out.println(context.getBean(Drawing.class).hashCode());
	}

}
