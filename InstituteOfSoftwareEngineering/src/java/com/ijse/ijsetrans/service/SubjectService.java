/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Subject;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface SubjectService {
     public boolean addSubject(Subject dto) throws Exception;
    public boolean mergeSubject(Subject dto) throws Exception;
    public boolean saveUpdateSubject(Subject dto)throws Exception;
    public boolean deleteSubject(int id) throws Exception;
    public boolean updateSubject(Subject dto) throws Exception;
    public Subject searchSubject(int id) throws Exception;
    public List<Subject> getSubjectList() throws Exception; 
    public List<Subject> advancedSubjectSearch(String name) throws Exception; 
    public Subject searchSubjectForLogin(String email, String pass)throws Exception;
    public List<Subject> getSubjectListA(String query) throws Exception; 
    public void flushSubject()throws Exception;
}
