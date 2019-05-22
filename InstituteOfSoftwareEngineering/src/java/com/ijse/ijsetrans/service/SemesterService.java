/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Semester;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface SemesterService {
     public boolean addSemester(Semester dto) throws Exception;
    public boolean mergeSemester(Semester dto) throws Exception;
    public boolean saveUpdateSemester(Semester dto)throws Exception;
    public boolean deleteSemester(int id) throws Exception;
    public boolean updateSemester(Semester dto) throws Exception;
    public Semester searchSemester(int id) throws Exception;
    public List<Semester> getSemesterList() throws Exception; 
    public List<Semester> advancedSemesterSearch(String name) throws Exception; 
    public Semester searchSemesterForLogin(String email, String pass)throws Exception;
    public List<Semester> getSemesterListA(String query) throws Exception; 
    public void flushSemester()throws Exception;
}
