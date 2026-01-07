package com.springboot.m_cruddemo_advanced.dao;

import com.springboot.m_cruddemo_advanced.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
