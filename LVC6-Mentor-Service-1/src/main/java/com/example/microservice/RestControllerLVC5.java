package com.example.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerLVC5 {
	
	// /hello
	@RequestMapping("/hello")
	public String hello() {
		return "HelloWorld!!!!!!!";
	}
}
