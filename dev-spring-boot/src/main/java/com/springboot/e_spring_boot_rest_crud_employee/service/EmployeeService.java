package com.springboot.e_spring_boot_rest_crud_employee.service;

import java.util.List;

import com.springboot.e_spring_boot_rest_crud_employee.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
