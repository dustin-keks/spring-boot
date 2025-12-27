package com.springboot.g_spring_boot_rest_crud_employee_spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.g_spring_boot_rest_crud_employee_spring_data_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code!
}
