package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.BankData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.service.BankDataService;

@RestController
@RequestMapping("/bank_data")
public class BankDataController {
	
	BankDataService bankDataService;

	public BankDataService getBankDataService() {
		return bankDataService;
	}

	@Autowired
	public void setBankDataService(BankDataService bankDataService) {
		this.bankDataService = bankDataService;
	}
	
	@GetMapping()
	public List<BankData> getBankData(){
		return bankDataService.getAllBankData();
	}
	
	@GetMapping("/{id}")
	public BankData findBankDataById(@PathVariable String id) throws ResourceNotFoundException {
		return bankDataService.find(id);
	}
	
}
