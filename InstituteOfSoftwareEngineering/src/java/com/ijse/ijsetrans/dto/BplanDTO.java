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
public class BplanDTO extends SuperDTO{

    private int id;
    private String planeName;
    private Set<BatchDTO> batches = new HashSet<>();
    private Set<CourseDTO> course = new HashSet<>();

    public BplanDTO() {
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
     * @return the planeName
     */
    public String getPlaneName() {
        return planeName;
    }

    /**
     * @param planeName the planeName to set
     */
    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    /**
     * @return the batches
     */
    public Set<BatchDTO> getBatches() {
        return batches;
    }

    /**
     * @param batches the batches to set
     */
    public void setBatches(Set<BatchDTO> batches) {
        this.batches = batches;
    }

    /**
     * @return the course
     */
    public Set<CourseDTO> getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Set<CourseDTO> course) {
        this.course = course;
    }
    
    
}
