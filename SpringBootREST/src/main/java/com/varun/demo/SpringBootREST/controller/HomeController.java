package com.varun.demo.SpringBootREST.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.varun.demo.SpringBootREST.dao.StudentDAO;
import com.varun.demo.SpringBootREST.model.Student;

@Controller
public class HomeController {
	@Autowired
	StudentDAO student;
	@RequestMapping("/student/{id}")
	@ResponseBody
	public Optional<Student> showStudent(@PathVariable("id") int id){
		
		return student.findById(id);
	}
}
