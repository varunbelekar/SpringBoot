package com.varun.demo.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext obj=SpringApplication.run(FirstProjectApplication.class, args);
		
		Student s=obj.getBean(Student.class);
		s.display();
	}

}

