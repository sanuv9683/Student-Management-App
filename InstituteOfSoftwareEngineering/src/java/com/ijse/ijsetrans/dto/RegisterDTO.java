/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sanu Vithanage
 */
public class RegisterDTO extends SuperDTO{

    private int rid;
    private Date regDate;
    private StudentDTO student;
    private PaymentDTO payment;
    private Set<BranchDTO> branch = new HashSet<>();
    private Set<BatchDTO> batchs = new HashSet<>();
    private Set<LoggerrDTO> loggerrs = new HashSet<>();

    public RegisterDTO() {
    }

    /**
     * @return the rid
     */
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
    public StudentDTO getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    /**
     * @return the payment
     */
    public PaymentDTO getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    /**
     * @return the branch
     */
    public Set<BranchDTO> getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(Set<BranchDTO> branch) {
        this.branch = branch;
    }

    /**
     * @return the batchs
     */
    public Set<BatchDTO> getBatchs() {
        return batchs;
    }

    /**
     * @param batchs the batchs to set
     */
    public void setBatchs(Set<BatchDTO> batchs) {
        this.batchs = batchs;
    }

    /**
     * @return the loggerrs
     */
    public Set<LoggerrDTO> getLoggerrs() {
        return loggerrs;
    }

    /**
     * @param loggerrs the loggerrs to set
     */
    public void setLoggerrs(Set<LoggerrDTO> loggerrs) {
        this.loggerrs = loggerrs;
    }
    
    

}
