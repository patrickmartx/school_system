package com.patrickmartx.school_system.domain.repository;

import com.patrickmartx.school_system.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
