/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

/**
 *
 * @author Sanu
 */
public class TempMessagesDTO {

    private int mid;
    private String date;
    private int toUser;
    private int fromUser;
    private String ReceiversName;
    private String lastMessage;
    private String cf;
    private String mSpecial;

    public TempMessagesDTO() {
    }

    /**
     * @return the mid
     */
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
     * @return the ReceiversName
     */
    public String getReceiversName() {
        return ReceiversName;
    }

    /**
     * @param ReceiversName the ReceiversName to set
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    /**
     * @return the lastMessage
     */
    public String getLastMessage() {
        return lastMessage;
    }

    /**
     * @param lastMessage the lastMessage to set
     */
    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    /**
     * @return the cf
     */
    public String getCf() {
        return cf;
    }

    /**
     * @param cf the cf to set
     */
    public void setCf(String cf) {
        this.cf = cf;
    }

    /**
     * @return the mSpecial
     */
    public String getmSpecial() {
        return mSpecial;
    }

    /**
     * @param mSpecial the mSpecial to set
     */
    public void setmSpecial(String mSpecial) {
        this.mSpecial = mSpecial;
    }

}
