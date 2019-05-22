/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 *
 * @author Sanu
 */
@Entity
@Table(name = "Message")
public class Message extends SuperCore {

    private int mid;
    private String date;
    private Set<User> user = new HashSet<User>();
    private Set<Student> students = new HashSet<Student>();
    private Set<Admin> admin = new HashSet<Admin>();
    private int toUser;
    private int fromUser;
    private String mIdentity;
    private Set<TextMessage> textMessages = new HashSet<TextMessage>();

    public Message() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(int mid) {
        this.mid = mid;
    }

    /**
     * @return the date
     */
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the toUser
     */
    @Column(name = "toUser")
    public int getToUser() {
        return toUser;
    }

    /**
     * @param toUser the toUser to set
     */
    public void setToUser(int toUser) {
        this.toUser = toUser;
    }

    /**
     * @return the fromUser
     */
    @Column(name = "fromUser")
    public int getFromUser() {
        return fromUser;
    }

    /**
     * @param fromUser the fromUser to set
     */
    public void setFromUser(int fromUser) {
        this.fromUser = fromUser;
    }

    /**
     * @return the textMessages
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OrderBy(value = "id")
    public Set<TextMessage> getTextMessages() {
        return textMessages;
    }

    /**
     * @param textMessages the textMessages to set
     */
    public void setTextMessages(Set<TextMessage> textMessages) {
        this.textMessages = textMessages;
    }

    /**
     * @return the user
     */
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "messages")
    public Set<User> getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Set<User> user) {
        this.user = user;
    }

    /**
     * @return the mIdentity
     */
    public String getmIdentity() {
        return mIdentity;
    }

    /**
     * @param mIdentity the mIdentity to set
     */
    public void setmIdentity(String mIdentity) {
        this.mIdentity = mIdentity;
    }

    /**
     * @return the students
     */
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "messages")
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    /**
     * @return the admin
     */
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "messages")
    public Set<Admin> getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(Set<Admin> admin) {
        this.admin = admin;
    }

}
