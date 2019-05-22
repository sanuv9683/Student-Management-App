/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.MainSubjects;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface MainSubjectsService {
    public boolean addMainSubjects(MainSubjects dto) throws Exception;
    public boolean mergeMainSubjects(MainSubjects dto) throws Exception;
    public boolean saveUpdateMainSubjects(MainSubjects dto)throws Exception;
    public boolean deleteMainSubjects(int id) throws Exception;
    public boolean updateMainSubjects(MainSubjects dto) throws Exception;
    public MainSubjects searchMainSubjects(int id) throws Exception;
    public List<MainSubjects> getMainSubjectsList() throws Exception; 
    public List<MainSubjects> advancedMainSubjectsSearch(String name) throws Exception; 
    public MainSubjects searchMainSubjectsForLogin(String email, String pass)throws Exception;
    public List<MainSubjects> getMainSubjectsListA(String query) throws Exception; 
    public void flushMainSubjects()throws Exception;
}
