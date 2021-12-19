package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.BankData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.repository.BankDataRepository;

@Service
public class BankDataService {
	
	private BankDataRepository bankDataRepository;
	
	public BankDataRepository getBankDataRepository() {
		return bankDataRepository;
	}

	@Autowired
	public void setBankDataRepository(BankDataRepository bankDataRepository) {
		this.bankDataRepository = bankDataRepository;
	}
	
	public List<BankData> getAllBankData(){
		return bankDataRepository.findAll();
	}
	
	public BankData find(String id) throws ResourceNotFoundException {
		Optional<BankData> optBankData = bankDataRepository.findById(id);
		if(optBankData.isEmpty())
			throw new ResourceNotFoundException("Bank ID Not Found");
		return optBankData.get();
	}

}
