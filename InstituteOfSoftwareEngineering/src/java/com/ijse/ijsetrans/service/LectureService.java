/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Lectures;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface LectureService {
    public boolean addLectures(Lectures dto) throws Exception;
    public boolean mergeLectures(Lectures dto) throws Exception;
    public boolean saveUpdateLectures(Lectures dto)throws Exception;
    public boolean deleteLectures(int id) throws Exception;
    public boolean updateLectures(Lectures dto) throws Exception;
    public Lectures searchLectures(int id) throws Exception;
    public List<Lectures> getLecturesList() throws Exception; 
    public List<Lectures> advancedLecturesSearch(String name) throws Exception; 
    public Lectures searchLecturesForLogin(String email, String pass)throws Exception;
    public List<Lectures> getLecturesListA(String query) throws Exception; 
    public void flushLectures()throws Exception;
}
