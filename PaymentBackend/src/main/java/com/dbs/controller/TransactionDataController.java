package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.CustomerData;
import com.dbs.entity.TransactionData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.service.CustomerDataService;
import com.dbs.service.TransactionDataService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/transaction_data")
public class TransactionDataController {
	
	TransactionDataService transactionDataService;
	CustomerDataService customerDataService;
	
	public TransactionDataService getTransactionDataService() {
		return transactionDataService;
	}
	
	@Autowired
	public void setTransactionDataService(TransactionDataService transactionDataService) {
		this.transactionDataService = transactionDataService;
	}

	public CustomerDataService getCustomerDataService() {
		return customerDataService;
	}

	@Autowired
	public void setCustomerDataService(CustomerDataService customerDataService) {
		this.customerDataService = customerDataService;
	}
	
	@GetMapping()
	public List<TransactionData> getTransactionData(){
		return transactionDataService.getAllTransactionData();
	}

	@PostMapping()
	public void postData(@RequestBody TransactionData transactionData) throws ResourceNotFoundException {
		System.out.println(transactionData);
		CustomerData sender = customerDataService.find(transactionData.getSender_id());
		System.out.println("Before Updation sender:"+sender);
		sender.setClear_balance(sender.getClear_balance()-transactionData.getAmount());
		customerDataService.update(sender);
		System.out.println("After Updation:"+sender);
		if(transactionData.getTransfer_type().equals("Bank Transfer")) {
			CustomerData receiver = customerDataService.find(transactionData.getReceiver_id());
			System.out.println("Before Updation receiverer:"+receiver);
			receiver.setClear_balance(receiver.getClear_balance()+transactionData.getAmount());
			customerDataService.update(receiver);
			System.out.println("after Updation receiverer:"+receiver);
		}
		transactionDataService.save(transactionData);
	}

}
