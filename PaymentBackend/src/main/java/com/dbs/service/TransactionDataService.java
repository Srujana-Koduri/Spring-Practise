package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.TransactionData;
import com.dbs.exception.ResourceNotFoundException;
import com.dbs.repository.TransactionDataRepository;

@Service
public class TransactionDataService {
	private TransactionDataRepository transactionDataRepository;

	public TransactionDataRepository getTransactionDataRepository() {
		return transactionDataRepository;
	}

	@Autowired
	public void setTransactionDataRepository(TransactionDataRepository transactionDataRepository) {
		this.transactionDataRepository = transactionDataRepository;
	}
	
	public List<TransactionData> getAllTransactionData(){
		return transactionDataRepository.findAll();
	}
	
	public TransactionData save(TransactionData transactionData) {
		return transactionDataRepository.save(transactionData);
	}
	
}
