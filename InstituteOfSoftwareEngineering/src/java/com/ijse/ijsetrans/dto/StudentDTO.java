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
public class StudentDTO extends SuperDTO {

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
    private String dob;
    private String gender;
    private String nic;
    private double regFree;
    private String joinDate;
    private RegisterDTO regist;
    private IQDTO iqTest;
    private SchoolDTO school;
    private UniversityDTO univercity;
    private Set<GardianDTO> gardina = new HashSet<>();
    private Set<ExamDTO> exams = new HashSet<>();

    public StudentDTO() {
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
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
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
    public String getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return the regist
     */
    public RegisterDTO getRegist() {
        return regist;
    }

    /**
     * @param regist the regist to set
     */
    public void setRegist(RegisterDTO regist) {
        this.regist = regist;
    }

    /**
     * @return the iqTest
     */
    public IQDTO getIqTest() {
        return iqTest;
    }

    /**
     * @param iqTest the iqTest to set
     */
    public void setIqTest(IQDTO iqTest) {
        this.iqTest = iqTest;
    }

    /**
     * @return the school
     */
    public SchoolDTO getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(SchoolDTO school) {
        this.school = school;
    }

    /**
     * @return the univercity
     */
    public UniversityDTO getUnivercity() {
        return univercity;
    }

    /**
     * @param univercity the univercity to set
     */
    public void setUnivercity(UniversityDTO univercity) {
        this.univercity = univercity;
    }

    /**
     * @return the gardina
     */
    public Set<GardianDTO> getGardina() {
        return gardina;
    }

    /**
     * @param gardina the gardina to set
     */
    public void setGardina(Set<GardianDTO> gardina) {
        this.gardina = gardina;
    }

    /**
     * @return the exams
     */
    public Set<ExamDTO> getExams() {
        return exams;
    }

    /**
     * @param exams the exams to set
     */
    public void setExams(Set<ExamDTO> exams) {
        this.exams = exams;
    }
    
    
    
}
