/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sanu
 */
@Entity
@Table(name = "Notification")
public class Notification extends SuperCore {

    private int nid;
    private Date date;
    private User user;
    private Admin admin;
    private Student student;
    private String notMessage;
    private String read;

    public Notification() {
    }

    /**
     * @return the nid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getNid() {
        return nid;
    }

    /**
     * @param nid the nid to set
     */
    public void setNid(int nid) {
        this.nid = nid;
    }

    /**
     * @return the date
     */
    @Column(name = "date")
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
     * @return the dto
     */
    /**
     * @return the notMessage
     */
    @Column(name = "NotyMassage", length = 65535)
    public String getNotMessage() {
        return notMessage;
    }

    /**
     * @param notMessage the notMessage to set
     */
    public void setNotMessage(String notMessage) {
        this.notMessage = notMessage;
    }

    /**
     * @return the read
     */
    @Column(name = "readst")
    public String getRead() {
        return read;
    }

    /**
     * @param read the read to set
     */
    public void setRead(String read) {
        this.read = read;
    }

    /**
     * @return the user
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the admin
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Admin getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    /**
     * @return the student
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

}
