package com.varun.demo.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class Hostel {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void displayHostel(){
		System.out.println("inside display hostel");
	}
}
