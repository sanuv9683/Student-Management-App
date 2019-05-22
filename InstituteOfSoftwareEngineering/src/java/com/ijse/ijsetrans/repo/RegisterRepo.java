/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Register;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface RegisterRepo {
   public boolean add(Register dto) throws Exception;
    public boolean merge(Register dto) throws Exception;
    public boolean saveUpdate(Register dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Register dto) throws Exception;
    public Register search(int id) throws Exception;
    public List<Register> getList() throws Exception; 
    public List<Register> advancedSearch(String name) throws Exception; 
    public Register searchForLogin(String email, String pass)throws Exception;
    public List<Register> getListA(String query) throws Exception; 
    public void flush()throws Exception;   
}
