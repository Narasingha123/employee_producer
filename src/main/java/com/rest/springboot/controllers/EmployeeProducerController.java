package com.rest.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.domain.Employee;


//http://localhost:8080/employee

@RestController
public class EmployeeProducerController {
	
	@RequestMapping(value="/employee" , method=RequestMethod.GET)
	public Employee employeePage() {
		
		Employee employee= new Employee();
		employee.setName("Narasingha Pattnayak");
		employee.setEmpId("201204");
		employee.setDesignation("Engineering Lead");
		employee.setSalary(2500000);
		
		return employee;
	}

}
