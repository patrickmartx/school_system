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
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student create(Student studentToCreate) {
        if (studentRepository.existsById(studentToCreate.getId())) {
            throw new IllegalArgumentException("Esse numero de registro já existe no banco");
        }
        return studentRepository.save(studentToCreate);
    }

    @Override
    public void remove(Student studentToRemove) {
        if (!studentRepository.existsById(studentToRemove.getId())) {
            throw new IllegalArgumentException("Não existe esse usuario no banco");
        }
        studentRepository.delete(studentToRemove);
    }
}
