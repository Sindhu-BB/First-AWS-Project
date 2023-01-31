package com.example.demo.firstAWSProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller{
	@RequestMapping("/student")
	public String sindhu() {
		return "Hello!";
	}

}
