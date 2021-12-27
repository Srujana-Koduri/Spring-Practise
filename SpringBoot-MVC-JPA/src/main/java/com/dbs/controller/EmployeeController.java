package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.entities.Department;
import com.dbs.entities.Employee;
import com.dbs.services.DepartmentService;
import com.dbs.services.EmployeeService;

@Controller
public class EmployeeController {
	
	EmployeeService employeeService;
	DepartmentService departmentService;

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	@Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("getAllEmployees")
	public ModelAndView getAllEmployees() {
		ModelAndView modelAndView = new ModelAndView("getAllEmployees");
		List<Employee> employees = employeeService.findAll();
		modelAndView.addObject("emps",employees);
		return modelAndView;
	}
	
	@RequestMapping("regEmp")
	public ModelAndView newEmployee() {
		System.out.println("Inside regEmp");
		ModelAndView modelAndView = new ModelAndView("newEmployee","employee",new Employee());
		List<Department> departments = departmentService.findAll();
		modelAndView.addObject("departments", departments);
		return modelAndView;
	}
	
	@RequestMapping(value = "saveEmp", method = RequestMethod.POST )
	public ModelAndView newEmployee(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("redirect:getAllEmployees");
		employeeService.save(employee);
		System.out.println("inside saveEmp");
		return modelAndView;
	}
	
	

}
