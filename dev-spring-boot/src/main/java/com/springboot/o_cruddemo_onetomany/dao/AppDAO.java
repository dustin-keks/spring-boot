package com.springboot.o_cruddemo_onetomany.dao;

import java.util.List;

import com.springboot.o_cruddemo_onetomany.entity.Course;
import com.springboot.o_cruddemo_onetomany.entity.Instructor;
import com.springboot.o_cruddemo_onetomany.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);
}
