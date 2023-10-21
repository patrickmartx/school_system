package com.patrickmartx.school_system.service.impl;

import com.patrickmartx.school_system.domain.model.Student;
import com.patrickmartx.school_system.domain.repository.StudentRepository;
import com.patrickmartx.school_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student findByRegistrationNumber(Long registrationNumber) {
        return studentRepository.findById(registrationNumber).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student create(Student studentToCreate) {
        if (studentRepository.existsById(studentToCreate.getRegistrationNumber())){
            throw new IllegalArgumentException("Esse numero de registro já existe no banco");
        }
        return studentRepository.save(studentToCreate);
    }
}
