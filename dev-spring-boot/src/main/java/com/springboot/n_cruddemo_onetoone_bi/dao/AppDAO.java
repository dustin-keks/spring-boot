package com.springboot.n_cruddemo_onetoone_bi.dao;

import com.springboot.n_cruddemo_onetoone_bi.entity.Instructor;
import com.springboot.n_cruddemo_onetoone_bi.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
