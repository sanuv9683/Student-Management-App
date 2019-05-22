/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Semester;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface SemesterRepo {
   public boolean add(Semester dto) throws Exception;
    public boolean merge(Semester dto) throws Exception;
    public boolean saveUpdate(Semester dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Semester dto) throws Exception;
    public Semester search(int id) throws Exception;
    public List<Semester> getList() throws Exception; 
    public List<Semester> advancedSearch(String name) throws Exception; 
    public Semester searchForLogin(String email, String pass)throws Exception;
    public List<Semester> getListA(String query) throws Exception; 
    public void flush()throws Exception;   
}
