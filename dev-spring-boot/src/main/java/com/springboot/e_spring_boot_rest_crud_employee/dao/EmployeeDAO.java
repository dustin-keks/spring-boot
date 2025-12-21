package com.springboot.e_spring_boot_rest_crud_employee.dao;

import java.util.List;

import com.springboot.e_spring_boot_rest_crud_employee.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
}
