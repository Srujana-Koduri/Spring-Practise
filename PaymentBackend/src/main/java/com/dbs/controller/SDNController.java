package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.service.SDN;

@RestController
@RequestMapping("/sdn")
public class SDNController {
	
	SDN sdn;

	public SDN getSdn() {
		return sdn;
	}
	
	@Autowired
	public void setSdn(SDN sdn) {
		this.sdn = sdn;
	}

	public SDNController() {
		super();
	}

	public SDNController(SDN sdn) {
		super();
		this.sdn = sdn;
	}
	
	@GetMapping("/{name}")
	public boolean checkReceiverNameInSDN(@PathVariable String name) {
		return sdn.checkSDN(name);
	}

}
