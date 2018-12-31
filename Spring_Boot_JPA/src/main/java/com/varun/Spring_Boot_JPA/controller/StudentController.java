package com.varun.Spring_Boot_JPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varun.Spring_Boot_JPA.dao.StudentDAO;
import com.varun.Spring_Boot_JPA.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDAO student;
	
	@RequestMapping("/show")
	public String showForm(){
		return "studentForm";
	}
	
	@RequestMapping("/process")
	public String processForm(Student s){
		student.save(s);
		return "studentForm";
	}
}
