package com.dbs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dbs.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
	List<Employee> findAllByDept(int dept_id);
}
