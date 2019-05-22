/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.User;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface UserService {
     public boolean addUser(User dto) throws Exception;
    public boolean mergeUser(User dto) throws Exception;
    public boolean saveUpdateUser(User dto)throws Exception;
    public boolean deleteUser(int id) throws Exception;
    public boolean updateUser(User dto) throws Exception;
    public User searchUser(int id) throws Exception;
    public List<User> getUserList() throws Exception; 
    public List<User> advancedUserSearch(String name) throws Exception; 
    public User searchUserForLogin(String email, String pass)throws Exception;
    public List<User> getUserListA(String query) throws Exception; 
    public void flushUser()throws Exception;
}
