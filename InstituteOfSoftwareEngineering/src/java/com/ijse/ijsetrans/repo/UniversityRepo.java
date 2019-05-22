/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.University;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface UniversityRepo {
   public boolean add(University dto) throws Exception;
    public boolean merge(University dto) throws Exception;
    public boolean saveUpdate(University dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(University dto) throws Exception;
    public University search(int id) throws Exception;
    public List<University> getList() throws Exception; 
    public List<University> advancedSearch(String name) throws Exception; 
    public University searchForLogin(String email, String pass)throws Exception;
    public List<University> getListA(String query) throws Exception; 
    public void flush()throws Exception;   
}
