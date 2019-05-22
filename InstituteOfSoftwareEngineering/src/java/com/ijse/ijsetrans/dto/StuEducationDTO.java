/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

/**
 *
 * @author Sanu AK
 */
public class StuEducationDTO {

    private int uid;
    private String uuni_name;
    private String uyear;

    private int sid;
    private String schoolName;
    private String slocation;

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the uuni_name
     */
    public String getUuni_name() {
        return uuni_name;
    }

    /**
     * @param uuni_name the uuni_name to set
     */
    public void setUuni_name(String uuni_name) {
        this.uuni_name = uuni_name;
    }

    /**
     * @return the uyear
     */
    public String getUyear() {
        return uyear;
    }

    /**
     * @param uyear the uyear to set
     */
    public void setUyear(String uyear) {
        this.uyear = uyear;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return the slocation
     */
    public String getSlocation() {
        return slocation;
    }

    /**
     * @param slocation the slocation to set
     */
    public void setSlocation(String slocation) {
        this.slocation = slocation;
    }

}
