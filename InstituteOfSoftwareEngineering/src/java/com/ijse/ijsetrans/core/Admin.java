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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class Admin extends SuperCore {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private String ppic;
    private Set<Loggerr> logger = new HashSet<>();
    private Set<Message> messages = new HashSet<>();
    private Set<Notification> notyDes = new HashSet<>();
    private Country myContry;

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
     * @return the logger
     */
    @OneToMany(mappedBy = "admin")
    public Set<Loggerr> getLogger() {
        return logger;
    }

    /**
     * @param logger the logger to set
     */
    public void setLogger(Set<Loggerr> logger) {
        this.logger = logger;
    }

    /**
     * @return the messages
     */
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OrderBy(value = "mid")
    public Set<Message> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    /**
     * @return the notyDes
     */
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "admin")
    @OrderBy(value = "nid")
    public Set<Notification> getNotyDes() {
        return notyDes;
    }

    /**
     * @param notyDes the notyDes to set
     */
    public void setNotyDes(Set<Notification> notyDes) {
        this.notyDes = notyDes;
    }

    /**
     * @return the myContry
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Country getMyContry() {
        return myContry;
    }

    /**
     * @param myContry the myContry to set
     */
    public void setMyContry(Country myContry) {
        this.myContry = myContry;
    }

}
