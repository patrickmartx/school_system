package com.patrickmartx.school_system.service;

import com.patrickmartx.school_system.domain.model.Student;

public interface StudentService {

    Student findById(Long id);

    Student create(Student studentToCreate);

    void remove(Student studentToRemove);
}
