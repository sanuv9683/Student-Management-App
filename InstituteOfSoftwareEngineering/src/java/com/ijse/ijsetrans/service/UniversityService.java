/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.University;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface UniversityService {
     public boolean addUniversity(University dto) throws Exception;
    public boolean mergeUniversity(University dto) throws Exception;
    public boolean saveUpdateUniversity(University dto)throws Exception;
    public boolean deleteUniversity(int id) throws Exception;
    public boolean updateUniversity(University dto) throws Exception;
    public University searchUniversity(int id) throws Exception;
    public List<University> getUniversityList() throws Exception; 
    public List<University> advancedUniversitySearch(String name) throws Exception; 
    public University searchUniversityForLogin(String email, String pass)throws Exception;
    public List<University> getUniversityListA(String query) throws Exception; 
    public void flushUniversity()throws Exception;
}
