package com.dbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dbs.entities.Department;
import com.dbs.entities.Employee;
import com.dbs.services.DepartmentService;
import com.dbs.services.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
		DepartmentService departmentService = ctxt.getBean(DepartmentService.class);
		
		Department dept1 = new Department("Sales");
		Department dept2 = new Department("Production");
		
		Employee emp1 = new Employee("Akhil");
		Employee emp2 = new Employee("Vijay");
		Employee emp3 = new Employee("Abhiram");
		Employee emp4 = new Employee("Kapil");
		
		List<Employee> empList1 = new ArrayList<>();
		empList1.add(emp1);
		empList1.add(emp2);
		
		List<Employee> empList2 = new ArrayList<>();
		empList2.add(emp3);
		empList2.add(emp4);
		
		dept1.setEmployees(empList1);
		dept2.setEmployees(empList2);
		
		emp1.setDepartment(dept1);
		emp2.setDepartment(dept1);
		
		emp3.setDepartment(dept2);
		emp4.setDepartment(dept2);
		
		departmentService.save(dept1);
		departmentService.save(dept2);
		
		employeeService.save(emp1);
		employeeService.save(emp2);
		employeeService.save(emp3);
		employeeService.save(emp4);
		
	}

}
