/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.User;
import com.ijse.ijsetrans.repo.UserRepo;
import com.ijse.ijsetrans.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu Vithanage
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRespo;

    @Override
    public boolean addUser(User dto) throws Exception {
        return userRespo.add(dto);
    }

    @Override
    public boolean mergeUser(User dto) throws Exception {
        return userRespo.merge(dto);
    }

    @Override
    public boolean saveUpdateUser(User dto) throws Exception {
        return userRespo.saveUpdate(dto);
    }

    @Override
    public boolean deleteUser(int id) throws Exception {
        return userRespo.delete(id);
    }

    @Override
    public boolean updateUser(User dto) throws Exception {
        return userRespo.update(dto);
    }

    @Override
    public User searchUser(int id) throws Exception {
        return userRespo.search(id);
    }

    @Override
    public List<User> getUserList() throws Exception {
        return userRespo.getList();
    }

    @Override
    public List<User> advancedUserSearch(String name) throws Exception {
        return userRespo.advancedSearch(name);
    }

    @Override
    public User searchUserForLogin(String email, String pass) throws Exception {
        return userRespo.searchForLogin(email, pass);
    }

    @Override
    public List<User> getUserListA(String query) throws Exception {
        return userRespo.getListA(query);
    }

    @Override
    public void flushUser() throws Exception {
        userRespo.flush();
    }

}
