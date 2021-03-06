package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
