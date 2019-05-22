/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sanu Vithanage
 */
public class SemesterDTO extends SuperDTO{

    private int id;
    private int semesterNo;
    private String semName;
    private ProjectsDTO project;
    private Set<CourseDTO> courses = new HashSet<>();
    private Set<SubjectDTO> subjects = new HashSet<>();

    public SemesterDTO() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the semesterNo
     */
    public int getSemesterNo() {
        return semesterNo;
    }

    /**
     * @param semesterNo the semesterNo to set
     */
    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    /**
     * @return the semName
     */
    public String getSemName() {
        return semName;
    }

    /**
     * @param semName the semName to set
     */
    public void setSemName(String semName) {
        this.semName = semName;
    }

    /**
     * @return the project
     */
    public ProjectsDTO getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(ProjectsDTO project) {
        this.project = project;
    }

    /**
     * @return the courses
     */
    public Set<CourseDTO> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(Set<CourseDTO> courses) {
        this.courses = courses;
    }

    /**
     * @return the subjects
     */
    public Set<SubjectDTO> getSubjects() {
        return subjects;
    }

    /**
     * @param subjects the subjects to set
     */
    public void setSubjects(Set<SubjectDTO> subjects) {
        this.subjects = subjects;
    }
    
    
}
