/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Loggerr;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface LoggerrRepo {
    public boolean add(Loggerr dto) throws Exception;
    public boolean merge(Loggerr dto) throws Exception;
    public boolean saveUpdate(Loggerr dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Loggerr dto) throws Exception;
    public Loggerr search(int id) throws Exception;
    public List<Loggerr> getList() throws Exception; 
    public List<Loggerr> advancedSearch(String name) throws Exception; 
    public Loggerr searchForLogin(String email, String pass)throws Exception;
    public List<Loggerr> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
