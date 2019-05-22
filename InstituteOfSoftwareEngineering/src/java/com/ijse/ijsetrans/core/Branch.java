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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
@Table(name = "Branch")
public class Branch extends SuperCore {

    private int id;
    private String branchName;
    private String branchLocation;
    private String address1;
    private String address2;
    private String address3;
    private String contactNum;
    private Set<Register> registrations = new HashSet<>();
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
     * @return the branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * @param branchName the branchName to set
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * @return the registrations
     */
    @ManyToMany(mappedBy = "branches")
    public Set<Register> getRegistrations() {
        return registrations;
    }

    /**
     * @param registrations the registrations to set
     */
    public void setRegistrations(Set<Register> registrations) {
        this.registrations = registrations;
    }

    /**
     * @return the branchLocation
     */
    public String getBranchLocation() {
        return branchLocation;
    }

    /**
     * @param branchLocation the branchLocation to set
     */
    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * @return the contactNum
     */
    public String getContactNum() {
        return contactNum;
    }

    /**
     * @param contactNum the contactNum to set
     */
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    /**
     * @return the batches
     */
    @OneToMany(mappedBy = "branchi")
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
