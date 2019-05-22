/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Exam;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface ExamService {
     public boolean addExam(Exam dto) throws Exception;
    public boolean mergeExam(Exam dto) throws Exception;
    public boolean saveUpdateExam(Exam dto)throws Exception;
    public boolean deleteExam(int id) throws Exception;
    public boolean updateExam(Exam dto) throws Exception;
    public Exam searchExam(int id) throws Exception;
    public List<Exam> getExamList() throws Exception; 
    public List<Exam> advancedExamSearch(String name) throws Exception; 
    public Exam searchExamForLogin(String email, String pass)throws Exception;
    public List<Exam> getExamListA(String query) throws Exception; 
    public void flushExam()throws Exception;
}
