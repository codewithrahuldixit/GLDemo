package com.example.restwithdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restwithdatabase.model.User;
import com.example.restwithdatabase.repositries.UserRepository;

@RestController
public class UserController {
	@Autowired
 private UserRepository repository;
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World This Is First Rest Api!!!!!!";
	} 
	
	@GetMapping("/users")
	public List<User> reteriveUsers() {
		return repository.getUsers();
	}
	@PostMapping("/users")
	public void storeUser(@RequestBody User user) {
		repository.save(user);
	}
}
