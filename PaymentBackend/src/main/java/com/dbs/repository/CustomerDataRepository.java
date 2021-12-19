package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.entity.CustomerData;


@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, String>{

}
