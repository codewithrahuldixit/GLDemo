package com.example.RestApiDemo.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.RestApiDemo.model.Student;

@Controller
public class ThymeLeaf_Demo_Controller {

	@GetMapping("/studentdemo")
	public String getStudentBean(Model model) {
		Student student = new Student(101, "Rahul Kumar Dixit", "rahul@gmail.com");
		model.addAttribute("stu", student);
		return "index";
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
