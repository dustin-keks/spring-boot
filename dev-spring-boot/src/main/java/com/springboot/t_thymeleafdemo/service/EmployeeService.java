package com.springboot.t_thymeleafdemo.service;

import java.util.List;

import com.springboot.t_thymeleafdemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
