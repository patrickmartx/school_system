package com.patrickmartx.school_system.service;

import com.patrickmartx.school_system.domain.model.Student;

public interface StudentService {

    Student findByRegistrationNumber(Long registrationNumber);

    Student create(Student studentToCreate);
}
