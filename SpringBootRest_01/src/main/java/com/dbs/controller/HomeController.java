package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name;
	}
	
	@ResponseBody
	@RequestMapping(value="hello", method=RequestMethod.POST)
	public String sayHello(@RequestParam String name, @RequestParam String tech) {
		return "hello " + name +", enjoy your learning with "+tech;
	}
	
	
}
