/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.User;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface UserRepo {
    public boolean add(User dto) throws Exception;
    public boolean merge(User dto) throws Exception;
    public boolean saveUpdate(User dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(User dto) throws Exception;
    public User search(int id) throws Exception;
    public List<User> getList() throws Exception; 
    public List<User> advancedSearch(String name) throws Exception; 
    public User searchForLogin(String email, String pass)throws Exception;
    public List<User> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
