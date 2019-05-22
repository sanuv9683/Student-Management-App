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
public class CourseDTO extends SuperDTO {

    private int id;
    private String ccode;
    private String courseName;
    private double courseFee;
    private Set<BplanDTO> course = new HashSet<>();
    private Set<SemesterDTO> semester = new HashSet<>();

    public CourseDTO() {
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
     * @return the ccode
     */
    public String getCcode() {
        return ccode;
    }

    /**
     * @param ccode the ccode to set
     */
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseFee
     */
    public double getCourseFee() {
        return courseFee;
    }

    /**
     * @param courseFee the courseFee to set
     */
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    /**
     * @return the course
     */
    public Set<BplanDTO> getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Set<BplanDTO> course) {
        this.course = course;
    }

    /**
     * @return the semester
     */
    public Set<SemesterDTO> getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(Set<SemesterDTO> semester) {
        this.semester = semester;
    }

}
