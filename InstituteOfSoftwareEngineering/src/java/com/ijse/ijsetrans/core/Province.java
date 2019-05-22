/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sanu
 */
@Entity
public class Province extends SuperCore{
    private int id;
    private long postalCode;
    private String province_name;
    private Country country;

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
     * @return the postalCode
     */
    public long getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the province_name
     */
    public String getProvince_name() {
        return province_name;
    }

    /**
     * @param province_name the province_name to set
     */
    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    /**
     * @return the country
     */
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }
    
    
}
