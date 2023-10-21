package com.patrickmartx.school_system.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "tb_curriculum")
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Subject> subjectList;
    @Column(precision = 4, scale = 2)
    List<BigDecimal> assessments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<BigDecimal> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<BigDecimal> assessments) {
        this.assessments = assessments;
    }
}
