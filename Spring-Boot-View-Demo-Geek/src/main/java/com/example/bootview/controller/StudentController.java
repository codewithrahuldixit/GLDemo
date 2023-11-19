package com.example.bootview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bootview.model.Student;
import com.example.bootview.service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("allstulist", studentServiceImpl.getAllStudent());
		return "index";
	}

	@GetMapping("/addnew")
	public String addNewStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "newStudent";
	}

	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentServiceImpl.save(student);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String updateForm(@PathVariable(value = "id") long id, Model model) {
		Student student = studentServiceImpl.getById(id);
		model.addAttribute("student", student);
		return "update";
	}

	@GetMapping("/deletestudent/{id}")
	public String deleteThroughId(@PathVariable(value = "id") long id) {
		studentServiceImpl.deleteViaId(id);
		return "redirect:/";

	}
}
