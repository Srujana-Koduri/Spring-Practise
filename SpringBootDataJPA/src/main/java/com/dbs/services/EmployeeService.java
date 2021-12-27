package com.dbs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entities.Employee;
import com.dbs.exceptions.InvalidEmployeeException;
import com.dbs.repo.DepartmentRepo;
import com.dbs.repo.EmployeeRepo;

@Service
public class EmployeeService {
	EmployeeRepo employeeRepo;
	DepartmentRepo departmentRepo;
	
	public EmployeeRepo getEmployeeRepo() {
		return employeeRepo;
	}
	
	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public DepartmentRepo getDepartmentRepo() {
		return departmentRepo;
	}
	
	@Autowired
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}
	
	public Employee find(int id) throws InvalidEmployeeException {
		Optional<Employee> optionalEmp = employeeRepo.findById(id);
		if(!optionalEmp.isPresent())
			throw new InvalidEmployeeException("Employee Id not found "+id);
		return optionalEmp.get();	
	}
	
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee update(Employee employee) throws InvalidEmployeeException {
		Optional<Employee> optionalEmp = employeeRepo.findById(employee.getId());
		if(!optionalEmp.isPresent())
			throw new InvalidEmployeeException("Employee not found to modify with id "+ employee.getId());
		return employeeRepo.save(employee);
	}
	
	public Employee delete(int id) throws InvalidEmployeeException {	
		Optional<Employee> optionalEmp = employeeRepo.findById(id);
		if (!optionalEmp.isPresent())
			throw new InvalidEmployeeException("Employee not found to delete with id " + id);
		Employee employee = optionalEmp.get();
		employeeRepo.deleteById(id);
		return employee;
	}
}
