package com.patrickmartx.school_system.controller;

import com.patrickmartx.school_system.domain.model.Student;
import com.patrickmartx.school_system.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{registrationNumber}")
    public ResponseEntity<Student> findByRegistrationNumber(@PathVariable Long registrationNumber) {
        var student = studentService.findByRegistrationNumber(registrationNumber);
        return ResponseEntity.ok(student);
    }

    @PostMapping()
    public ResponseEntity<Student> create(@RequestBody Student studentToCreate) {
        var studentCreated = studentService.create(studentToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{registrationNumber}")
                .buildAndExpand(studentCreated.getRegistrationNumber())
                .toUri();

        return ResponseEntity.created(location).body(studentCreated);
    }

    @DeleteMapping("/{registrationNumber}")
    public ResponseEntity<Student> create(@PathVariable Long registrationNumber) {
        var studentToRemove = studentService.findByRegistrationNumber(registrationNumber);
        studentService.remove(studentToRemove);

        return ResponseEntity.ok().body(studentToRemove);
    }


}
