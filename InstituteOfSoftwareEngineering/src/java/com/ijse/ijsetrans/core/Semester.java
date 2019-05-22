/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class Semester extends SuperCore {

    private int id;
    private int semesterNo;
    private String semName;
    private Set<Course> courses = new HashSet<>();
    private Set<Projects> projects = new HashSet<>();
    private Set<Subject> subjects = new HashSet<>();

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
     * @return the courses
     */
    @ManyToMany(mappedBy = "semesters",cascade = CascadeType.ALL)
    public Set<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    /**
     * @return the projects
     */
    @ManyToMany
    public Set<Projects> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }

    /**
     * @return the subjects
     */
    @ManyToMany
    public Set<Subject> getSubjects() {
        return subjects;
    }

    /**
     * @param subjects the subjects to set
     */
    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
    
    
    
}
