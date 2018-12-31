package com.varun.FirstWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String show(HttpServletRequest request){
		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		System.out.println("Hi");
		return "home";
	}
	
	@RequestMapping("/student")
	public String showForm(){
		return "studentForm";
	}
	
	@RequestMapping("/alternatehome")
	public ModelAndView getHome(@RequestParam("myname")String name){
		ModelAndView model = new ModelAndView();
		model.addObject("name",name);
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping("/secondhome")
	public ModelAndView showHome(Alien a){
		return new ModelAndView("home","alien",a);
	}
}
