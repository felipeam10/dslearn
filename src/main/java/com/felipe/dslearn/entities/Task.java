package com.felipe.dslearn.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson {

    private String description;
    private Integer questionsCount;
    private Integer aprovalCount;
    private Double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;

    public Task(){}

    public Task(Long id, String title, Integer position, Section section, String description, Integer questionsCount, Integer aprovalCount, Double weight, Instant dueDate) {
        super(id, title, position, section);
        this.description = description;
        this.questionsCount = questionsCount;
        this.aprovalCount = aprovalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public Integer getAprovalCount() {
        return aprovalCount;
    }

    public void setAprovalCount(Integer aprovalCount) {
        this.aprovalCount = aprovalCount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }
}
