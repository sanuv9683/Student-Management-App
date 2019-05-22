/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Subject;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface SubjectRepo {
    public boolean add(Subject dto) throws Exception;
    public boolean merge(Subject dto) throws Exception;
    public boolean saveUpdate(Subject dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Subject dto) throws Exception;
    public Subject search(int id) throws Exception;
    public List<Subject> getList() throws Exception; 
    public List<Subject> advancedSearch(String name) throws Exception; 
    public Subject searchForLogin(String email, String pass)throws Exception;
    public List<Subject> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
