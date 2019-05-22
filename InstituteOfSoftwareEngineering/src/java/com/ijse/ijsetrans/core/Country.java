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
import javax.persistence.OneToMany;

/**
 *
 * @author Sanu
 */
@Entity
public class Country extends SuperCore {

    private int id;
    private String countryname;
    private int countryCode;
    private Set<Province> provonce = new HashSet<Province>();
    private Set<User> allUsrs = new HashSet<User>();

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
     * @return the allUsrs
     */
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Set<User> getAllUsrs() {
        return allUsrs;
    }

    /**
     * @param allUsrs the allUsrs to set
     */
    public void setAllUsrs(Set<User> allUsrs) {
        this.allUsrs = allUsrs;
    }

    /**
     * @return the countryname
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * @param countryname the countryname to set
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * @return the countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the provonce
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set<Province> getProvonce() {
        return provonce;
    }

    /**
     * @param provonce the provonce to set
     */
    public void setProvonce(Set<Province> provonce) {
        this.provonce = provonce;
    }

}
