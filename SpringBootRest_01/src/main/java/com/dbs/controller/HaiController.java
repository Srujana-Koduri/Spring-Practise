package com.dbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hai")
public class HaiController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello People";
	}
	
	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello "+name;
	}
	
	@PostMapping("/postHello")
	public String postHello(@RequestParam("name") String str1, @RequestParam("tech") String str2) {
		return "Hello " + str1 + ", Enjoy your tech: "+ str2;
	}
}
