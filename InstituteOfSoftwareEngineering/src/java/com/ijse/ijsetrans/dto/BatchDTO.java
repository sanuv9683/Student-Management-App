/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

import com.ijse.ijsetrans.core.Branch;
import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.core.Subject;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sanu Vithanage
 */
public class BatchDTO extends SuperDTO {

    private String batchID;
    private String batchNo;
    private String startDate;
    private String batchType;
    private double gpa;
    private int total;
    private Branch branchi;
    private Set<Course> courses = new HashSet<>();
    private Set<Subject> subjects = new HashSet<>();

    public BatchDTO() {
    }

    public BatchDTO(String batchID, String batchNo, String startDate, String batchType, double gpa, int total, Branch branchi) {
        this.batchID = batchID;
        this.batchNo = batchNo;
        this.startDate = startDate;
        this.batchType = batchType;
        this.gpa = gpa;
        this.total = total;
        this.branchi = branchi;
    }

    /**
     * @return the batchID
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * @param batchID the batchID to set
     */
    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    /**
     * @return the batchNo
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo the batchNo to set
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the batchType
     */
    public String getBatchType() {
        return batchType;
    }

    /**
     * @param batchType the batchType to set
     */
    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the branchi
     */
    public Branch getBranchi() {
        return branchi;
    }

    /**
     * @param branchi the branchi to set
     */
    public void setBranchi(Branch branchi) {
        this.branchi = branchi;
    }

    /**
     * @return the courses
     */
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
     * @return the subjects
     */
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
