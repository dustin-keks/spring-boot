package com.springboot.n_cruddemo_onetoone_bi.dao;

import com.springboot.n_cruddemo_onetoone_bi.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
