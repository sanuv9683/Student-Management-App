/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.HashSet;
import java.util.Set;
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
public class Subject extends SuperCore {

    private int id;
    private String sub_name;
    private int credit;
    private String result;
    private Set<Semester> semesters = new HashSet<>();
    private Set<Batch> batches = new HashSet<>();

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
     * @return the sub_name
     */
    public String getSub_name() {
        return sub_name;
    }

    /**
     * @param sub_name the sub_name to set
     */
    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the semesters
     */
    @ManyToMany(mappedBy = "subjects")
    public Set<Semester> getSemesters() {
        return semesters;
    }

    /**
     * @param semesters the semesters to set
     */
    public void setSemesters(Set<Semester> semesters) {
        this.semesters = semesters;
    }

    /**
     * @return the batches
     */
    @ManyToMany(mappedBy = "subjects")
    public Set<Batch> getBatches() {
        return batches;
    }

    /**
     * @param batches the batches to set
     */
    public void setBatches(Set<Batch> batches) {
        this.batches = batches;
    }

}
