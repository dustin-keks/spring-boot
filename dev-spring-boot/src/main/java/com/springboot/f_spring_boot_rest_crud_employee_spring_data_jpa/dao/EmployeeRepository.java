package com.springboot.f_spring_boot_rest_crud_employee_spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.f_spring_boot_rest_crud_employee_spring_data_jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code!
}
