package com.varun.demo.SpringBootREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.varun.demo.SpringBootREST.model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{
	
}
