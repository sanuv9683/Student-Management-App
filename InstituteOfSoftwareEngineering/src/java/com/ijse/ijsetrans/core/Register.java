/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class Register extends SuperCore {

    private int rid;
    private Date regDate;
    private Student student;
    private Set<Branch>branches= new HashSet<>();

    /**
     * @return the rid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(int rid) {
        this.rid = rid;
    }

    /**
     * @return the regDate
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the student
     */
    @OneToOne(mappedBy = "register")
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the branches
     */
    @ManyToMany
    public Set<Branch> getBranches() {
        return branches;
    }

    /**
     * @param branches the branches to set
     */
    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }
    
    
    
    
}
