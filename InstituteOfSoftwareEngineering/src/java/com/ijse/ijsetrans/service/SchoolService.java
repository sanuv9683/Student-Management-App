/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.School;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface SchoolService {
     public boolean addSchool(School dto) throws Exception;
    public boolean mergeSchool(School dto) throws Exception;
    public boolean saveUpdateSchool(School dto)throws Exception;
    public boolean deleteSchool(int id) throws Exception;
    public boolean updateSchool(School dto) throws Exception;
    public School searchSchool(int id) throws Exception;
    public List<School> getSchoolList() throws Exception; 
    public List<School> advancedSchoolSearch(String name) throws Exception; 
    public School searchSchoolForLogin(String email, String pass)throws Exception;
    public List<School> getSchoolListA(String query) throws Exception; 
    public void flushSchool()throws Exception;
}
