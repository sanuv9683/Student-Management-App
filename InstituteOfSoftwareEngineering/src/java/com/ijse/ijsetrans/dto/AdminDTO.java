/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sanu Vithanage
 */
public class AdminDTO extends SuperDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private String ppic;
    private Set<LoggerrDTO> loggers = new HashSet<>();
    private Set<TrackerDTO> trackers = new HashSet<>();

    public AdminDTO() {
    }

    /**
     * @return the id
     */
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
     * @return the loggers
     */
    public Set<LoggerrDTO> getLoggers() {
        return loggers;
    }

    /**
     * @param loggers the loggers to set
     */
    public void setLoggers(Set<LoggerrDTO> loggers) {
        this.loggers = loggers;
    }

    /**
     * @return the trackers
     */
    public Set<TrackerDTO> getTrackers() {
        return trackers;
    }

    /**
     * @param trackers the trackers to set
     */
    public void setTrackers(Set<TrackerDTO> trackers) {
        this.trackers = trackers;
    }

}
