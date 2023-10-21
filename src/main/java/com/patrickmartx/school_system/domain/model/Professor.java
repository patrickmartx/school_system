package com.patrickmartx.school_system.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Subject subject;
    @Column(precision = 4, scale = 2)
    private BigDecimal evaluation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public BigDecimal getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(BigDecimal evaluation) {
        this.evaluation = evaluation;
    }
}

