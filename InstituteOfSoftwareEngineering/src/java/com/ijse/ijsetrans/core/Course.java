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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class Course extends SuperCore {

    private int id;
    private String ccode;
    private String courseName;
    private double courseFee;
    private Set<Batch> batches = new HashSet<>();
    private Set<Semester> semesters = new HashSet<>();

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
     * @return the batches
     */
    @ManyToMany(mappedBy = "courses")
    public Set<Batch> getBatches() {
        return batches;
    }

    /**
     * @param batches the batches to set
     */
    public void setBatches(Set<Batch> batches) {
        this.batches = batches;
    }

    /**
     * @return the semesters
     */
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    public Set<Semester> getSemesters() {
        return semesters;
    }

    /**
     * @param semesters the semesters to set
     */
    public void setSemesters(Set<Semester> semesters) {
        this.semesters = semesters;
    }

}
