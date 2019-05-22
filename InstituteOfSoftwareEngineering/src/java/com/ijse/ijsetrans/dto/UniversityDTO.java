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
public class UniversityDTO extends SuperDTO {

    private int id;
    private String uni_name;
    private String year;
    private Set<StudentDTO> students = new HashSet<>();

    public UniversityDTO() {
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
     * @return the uni_name
     */
    public String getUni_name() {
        return uni_name;
    }

    /**
     * @param uni_name the uni_name to set
     */
    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the students
     */
    public Set<StudentDTO> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set<StudentDTO> students) {
        this.students = students;
    }
    
    
}
