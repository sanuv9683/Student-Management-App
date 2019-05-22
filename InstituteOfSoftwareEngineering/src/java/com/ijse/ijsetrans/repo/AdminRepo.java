/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.Admin;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface AdminRepo {
    public boolean add(Admin dto) throws Exception;
    public boolean merge(Admin dto) throws Exception;
    public boolean saveUpdate(Admin dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Admin dto) throws Exception;
    public Admin search(int id) throws Exception;
    public List<Admin> getList() throws Exception; 
    public List<Admin> advancedSearch(String name) throws Exception; 
    public Admin searchForLogin(String email, String pass)throws Exception;
    public List<Admin> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
