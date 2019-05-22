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
public class GardianDTO extends SuperDTO {

    private int id;
    private String firstName;
    private String LastName;
    private String address1;
    private String address2;
    private String address3;
    private String pNumber;
    private String tNumber;
    private String pic;
    private Set<StudentDTO> students = new HashSet<>();

    public GardianDTO() {
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
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * @return the pNumber
     */
    public String getpNumber() {
        return pNumber;
    }

    /**
     * @param pNumber the pNumber to set
     */
    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    /**
     * @return the tNumber
     */
    public String gettNumber() {
        return tNumber;
    }

    /**
     * @param tNumber the tNumber to set
     */
    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    /**
     * @return the pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic the pic to set
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * @return the students
     */
    public Set<StudentDTO> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Set<StudentDTO> students) {
        this.students = students;
    }

}
