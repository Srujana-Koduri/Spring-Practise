package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.CustomerData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.service.CustomerDataService;

@RestController
@RequestMapping("/customer_data")
public class CustomerDataController {
	
	CustomerDataService customerDataService;

	public CustomerDataService getCustomerDataService() {
		return customerDataService;
	}

	@Autowired
	public void setCustomerDataService(CustomerDataService customerDataService) {
		this.customerDataService = customerDataService;
	}
	
	@GetMapping()
	public List<CustomerData> getCustomerData(){
		return customerDataService.getAllCustomerData();
	}

	@GetMapping("/{id}")
	public CustomerData findCustomerDataById(@PathVariable String id) throws ResourceNotFoundException {
		return customerDataService.find(id);
	}
}
