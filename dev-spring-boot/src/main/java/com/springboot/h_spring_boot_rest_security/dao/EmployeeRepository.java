package com.springboot.h_spring_boot_rest_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.h_spring_boot_rest_security.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
