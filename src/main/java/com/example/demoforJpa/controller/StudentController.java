package com.example.demoforJpa.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoforJpa.entity.Student;

@RestController
public class StudentController {
	
	
	@PostMapping("/api/students")
	public String saveStudent(@RequestBody Student student) {
		
		System.out.println(student);
		return"success";
	}

}
