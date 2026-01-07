package com.springboot.o_cruddemo_onetomany.dao;

import com.springboot.o_cruddemo_onetomany.entity.Instructor;
import com.springboot.o_cruddemo_onetomany.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
