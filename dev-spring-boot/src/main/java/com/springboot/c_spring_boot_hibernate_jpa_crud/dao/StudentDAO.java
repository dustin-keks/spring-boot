package com.springboot.c_spring_boot_hibernate_jpa_crud.dao;

import java.util.List;

import com.springboot.c_spring_boot_hibernate_jpa_crud.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();
}
