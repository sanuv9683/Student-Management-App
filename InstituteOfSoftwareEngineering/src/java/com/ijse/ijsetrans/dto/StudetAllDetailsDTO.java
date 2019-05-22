/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

import java.util.Date;

/**
 *
 * @author Sanu Vithanage
 */
public class StudetAllDetailsDTO {
//    student details

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

//    iq Details
    private int iqid;
    private Date iqdate;
    private double iqresult;
    private String iqstatus;

//    registration details
    private int rid;
    private Date regDate;

    public StudetAllDetailsDTO() {
    }

    public StudetAllDetailsDTO(int id, String studentID, String initName, String fName, String lastName, String address1, String address2, String address3, String tel_home, String tel_mob, String email, Date dateofBirth, String gender, String nic, double regFree, Date joinDate, int gid, String gfirstName, String gLastName, String gaddress1, String gaddress2, String gaddress3, String gpNumber, String gtNumber, String gFpic, int iqid, Date iqdate, double iqresult, String iqstatus, int rid, Date regDate) {
        this.id = id;
        this.studentID = studentID;
        this.initName = initName;
        this.fName = fName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.tel_home = tel_home;
        this.tel_mob = tel_mob;
        this.email = email;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
        this.nic = nic;
        this.regFree = regFree;
        this.joinDate = joinDate;
        this.iqid = iqid;
        this.iqdate = iqdate;
        this.iqresult = iqresult;
        this.iqstatus = iqstatus;
        this.rid = rid;
        this.regDate = regDate;
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
     * @return the iqid
     */
    public int getIqid() {
        return iqid;
    }

    /**
     * @param iqid the iqid to set
     */
    public void setIqid(int iqid) {
        this.iqid = iqid;
    }

    /**
     * @return the iqdate
     */
    public Date getIqdate() {
        return iqdate;
    }

    /**
     * @param iqdate the iqdate to set
     */
    public void setIqdate(Date iqdate) {
        this.iqdate = iqdate;
    }

    /**
     * @return the iqresult
     */
    public double getIqresult() {
        return iqresult;
    }

    /**
     * @param iqresult the iqresult to set
     */
    public void setIqresult(double iqresult) {
        this.iqresult = iqresult;
    }

    /**
     * @return the iqstatus
     */
    public String getIqstatus() {
        return iqstatus;
    }

    /**
     * @param iqstatus the iqstatus to set
     */
    public void setIqstatus(String iqstatus) {
        this.iqstatus = iqstatus;
    }

    /**
     * @return the rid
     */
    public int getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(int rid) {
        this.rid = rid;
    }

    /**
     * @return the regDate
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

}
