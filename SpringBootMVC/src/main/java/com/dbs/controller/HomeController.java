package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.beans.Person;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hello/{name}/{tech}")
	public ModelAndView hello(@PathVariable("name") String name, @PathVariable("tech") String tech) {
		String model= "Hello " +name + ", Tech: "+ tech;
		System.out.println(model);
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("a",model);
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public ModelAndView registration(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("mobile") String mobile) {
//		System.out.println("Username:" + name);
//		System.out.println("Email:" + email);
//		System.out.println("Mobile:" + mobile);
		Person person = new Person(name, email, mobile);
		ModelAndView modelAndView = new ModelAndView("regsuccess");
		modelAndView.addObject("person", person);
		return modelAndView;
	}

}
