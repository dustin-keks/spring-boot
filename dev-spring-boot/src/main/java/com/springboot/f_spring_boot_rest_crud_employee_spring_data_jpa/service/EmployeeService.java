package com.springboot.f_spring_boot_rest_crud_employee_spring_data_jpa.service;

import java.util.List;

import com.springboot.f_spring_boot_rest_crud_employee_spring_data_jpa.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
