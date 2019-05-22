/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class MainSemesters {

    private int id;
    private int semesterNo;
    private String semName;

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

}
