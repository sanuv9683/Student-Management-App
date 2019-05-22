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
import javax.persistence.OrderBy;

/**
 *
 * @author Sanu AK
 */
@Entity
public class Lectures extends SuperCore {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private String ppic;
    private String state;
    private Set<Clases> clasess = new HashSet<>();

    public Lectures() {
    }

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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the ppic
     */
    public String getPpic() {
        return ppic;
    }

    /**
     * @param ppic the ppic to set
     */
    public void setPpic(String ppic) {
        this.ppic = ppic;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the clasess
     */
    @OneToMany(mappedBy = "lectures",cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @OrderBy(value = "id")
    public Set<Clases> getClasess() {
        return clasess;
    }

    /**
     * @param clasess the clasess to set
     */
    public void setClasess(Set<Clases> clasess) {
        this.clasess = clasess;
    }

}
