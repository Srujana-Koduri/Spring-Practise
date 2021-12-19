package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.entity.TransactionData;

@Repository
public interface TransactionDataRepository extends JpaRepository<TransactionData, Integer>{

}
