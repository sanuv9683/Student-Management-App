/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Exam;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface ExamRepo {
  public boolean add(Exam dto) throws Exception;
    public boolean merge(Exam dto) throws Exception;
    public boolean saveUpdate(Exam dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Exam dto) throws Exception;
    public Exam search(int id) throws Exception;
    public List<Exam> getList() throws Exception; 
    public List<Exam> advancedSearch(String name) throws Exception; 
    public Exam searchForLogin(String email, String pass)throws Exception;
    public List<Exam> getListA(String query) throws Exception; 
    public void flush()throws Exception;    
}
