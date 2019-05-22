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
public class PaymentDTO extends SuperDTO {

    private int pid;
    private Date date;
    private RegisterDTO register;
    private Set<PlanDTO> plans = new HashSet<>();

    /**
     * @return the pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the register
     */
    public RegisterDTO getRegister() {
        return register;
    }

    /**
     * @param register the register to set
     */
    public void setRegister(RegisterDTO register) {
        this.register = register;
    }

    /**
     * @return the plans
     */
    public Set<PlanDTO> getPlans() {
        return plans;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(Set<PlanDTO> plans) {
        this.plans = plans;
    }

}
