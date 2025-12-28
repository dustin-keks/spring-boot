package com.springboot.h_spring_boot_rest_security.service;

import java.util.List;

import com.springboot.h_spring_boot_rest_security.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
