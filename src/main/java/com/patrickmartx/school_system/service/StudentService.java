package com.patrickmartx.school_system.service;

import com.patrickmartx.school_system.domain.model.Student;

import java.util.List;

public interface StudentService {

    Student findById(Long id);

    List<Student> findAll();

    Student create(Student studentToCreate);

    void remove(Student studentToRemove);
}
