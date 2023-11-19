package com.example.bootview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bootview.model.Student;
@Controller
public class DemoStudentController {
	@GetMapping("/subscribe")
	public String getSubscription() {		
		return "subscribe";
	}
	@PostMapping("/student")
	public String getStudent(@RequestParam String email,Model model) {		
		Student student = new Student(101l,"Rahul Kumar Dixit","rahul@gmail.com");
		model.addAttribute("email",email);
		model.addAttribute("student", student);
		return "demo";
	}		
	
	@GetMapping("/student")
	public String getStudent(Model model) {		
		Student student = new Student(101l,"Rahul Kumar Dixit","rahul@gmail.com");
		model.addAttribute("student", student);
		return "demo";
	}		
	/*
	//Bean is Used to Set Default Encoding 
	@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasenames("classpath:/messages");
	    messageSource.setDefaultEncoding("UTF-8");
	    return messageSource;
	}*/


}
