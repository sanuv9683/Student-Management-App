/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Admin;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface AdminService {
    public boolean addAdmin(Admin dto) throws Exception;
    public boolean mergeAdmin(Admin dto) throws Exception;
    public boolean saveUpdateAdmin(Admin dto)throws Exception;
    public boolean deleteAdmin(int id) throws Exception;
    public boolean updateAdmin(Admin dto) throws Exception;
    public Admin searchAdmin(int id) throws Exception;
    public List<Admin> getAdminList() throws Exception; 
    public List<Admin> advancedAdminSearch(String name) throws Exception; 
    public Admin searchAdminForLogin(String email, String pass)throws Exception;
    public List<Admin> getAdminListA(String query) throws Exception; 
    public void flushAdmin()throws Exception;
}
