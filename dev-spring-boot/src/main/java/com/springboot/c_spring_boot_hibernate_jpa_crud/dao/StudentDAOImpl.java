package com.springboot.c_spring_boot_hibernate_jpa_crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.c_spring_boot_hibernate_jpa_crud.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO{
    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    // implement find method
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
