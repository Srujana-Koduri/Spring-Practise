package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.CustomerData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.repository.CustomerDataRepository;

@Service
public class CustomerDataService {
	
	private CustomerDataRepository customerDataRepository;
	public CustomerDataRepository getCustomerDataRepository() {
		return customerDataRepository;
	}

	@Autowired
	public void setCustomerDataRepository(CustomerDataRepository customerDataRepository) {
		this.customerDataRepository = customerDataRepository;
	}
	public List<CustomerData> getAllCustomerData(){
		return customerDataRepository.findAll();
	}
	
	public CustomerData find(String id) throws ResourceNotFoundException {
		Optional<CustomerData> optCustomerData = customerDataRepository.findById(id);
		if(optCustomerData.isEmpty())
			throw new ResourceNotFoundException("Customer ID Not Found");
		return optCustomerData.get();
	}
	
	public CustomerData update(CustomerData customerData) throws ResourceNotFoundException {
		Optional<CustomerData> optCustomerData = customerDataRepository.findById(customerData.getId());
		if(optCustomerData.isEmpty())
			throw new ResourceNotFoundException("Customer ID Not Found");
		return customerDataRepository.save(customerData);
	}

}
