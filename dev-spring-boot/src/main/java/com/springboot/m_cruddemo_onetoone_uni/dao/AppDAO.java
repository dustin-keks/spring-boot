package com.springboot.m_cruddemo_onetoone_uni.dao;

import com.springboot.m_cruddemo_onetoone_uni.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
