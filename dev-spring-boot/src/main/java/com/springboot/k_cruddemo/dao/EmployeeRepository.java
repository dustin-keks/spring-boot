package com.springboot.k_cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.k_cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
