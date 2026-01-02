package com.springboot.k_cruddemo.service;

import java.util.List;

import com.springboot.k_cruddemo.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
