/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.School;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface SchoolRepo {
    public boolean add(School dto) throws Exception;
    public boolean merge(School dto) throws Exception;
    public boolean saveUpdate(School dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(School dto) throws Exception;
    public School search(int id) throws Exception;
    public List<School> getList() throws Exception; 
    public List<School> advancedSearch(String name) throws Exception; 
    public School searchForLogin(String email, String pass)throws Exception;
    public List<School> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
