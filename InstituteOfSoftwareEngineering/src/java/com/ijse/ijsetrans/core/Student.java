/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.core;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

/**
 *
 * @author Sanu Vithanage
 */
@Entity
public class Student extends SuperCore {

    private int id;
    private String studentID;
    private String initName;
    private String fName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private String tel_home;
    private String tel_mob;
    private String email;
    private Date dateofBirth;
    private String gender;
    private String nic;
    private double regFree;
    private Date joinDate;

    private Set<Gardian> gardians = new HashSet<>();
    private Set<School> schools = new HashSet<>();
    private IQTest iqTest;
    private Register register;
    private University university;
    private Set<Exam> exama = new HashSet<>();
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
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the initName
     */
    public String getInitName() {
        return initName;
    }

    /**
     * @param initName the initName to set
     */
    public void setInitName(String initName) {
        this.initName = initName;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
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
     * @return the tel_home
     */
    public String getTel_home() {
        return tel_home;
    }

    /**
     * @param tel_home the tel_home to set
     */
    public void setTel_home(String tel_home) {
        this.tel_home = tel_home;
    }

    /**
     * @return the tel_mob
     */
    public String getTel_mob() {
        return tel_mob;
    }

    /**
     * @param tel_mob the tel_mob to set
     */
    public void setTel_mob(String tel_mob) {
        this.tel_mob = tel_mob;
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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the regFree
     */
    public double getRegFree() {
        return regFree;
    }

    /**
     * @param regFree the regFree to set
     */
    public void setRegFree(double regFree) {
        this.regFree = regFree;
    }

    /**
     * @return the gardians
     */
    @ManyToMany(cascade = CascadeType.ALL)
    public Set<Gardian> getGardians() {
        return gardians;
    }

    /**
     * @param gardians the gardians to set
     */
    public void setGardians(Set<Gardian> gardians) {
        this.gardians = gardians;
    }

    /**
     * @return the schools
     */
    @ManyToMany(cascade = CascadeType.ALL)
    public Set<School> getSchools() {
        return schools;
    }

    /**
     * @param schools the schools to set
     */
    public void setSchools(Set<School> schools) {
        this.schools = schools;
    }

    /**
     * @return the iqTest
     */
    @OneToOne(cascade = CascadeType.ALL)
    public IQTest getIqTest() {
        return iqTest;
    }

    /**
     * @param iqTest the iqTest to set
     */
    public void setIqTest(IQTest iqTest) {
        this.iqTest = iqTest;
    }

    /**
     * @return the register
     */
    @OneToOne(cascade = CascadeType.ALL)
    public Register getRegister() {
        return register;
    }

    /**
     * @param register the register to set
     */
    public void setRegister(Register register) {
        this.register = register;
    }

    /**
     * @return the university
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public University getUniversity() {
        return university;
    }

    /**
     * @param university the university to set
     */
    public void setUniversity(University university) {
        this.university = university;
    }

    /**
     * @return the exama
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    public Set<Exam> getExama() {
        return exama;
    }

    /**
     * @param exama the exama to set
     */
    public void setExama(Set<Exam> exama) {
        this.exama = exama;
    }

    /**
     * @return the dateofBirth
     */
    public Date getDateofBirth() {
        return dateofBirth;
    }

    /**
     * @param dateofBirth the dateofBirth to set
     */
    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * @return the joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "student")
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
