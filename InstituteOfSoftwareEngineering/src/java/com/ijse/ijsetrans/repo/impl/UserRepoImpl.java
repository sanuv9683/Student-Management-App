/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.User;
import com.ijse.ijsetrans.repo.UserRepo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sanu Vithanage
 */
@Repository
public class UserRepoImpl implements UserRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(User dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(User dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(User dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(User dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public User search(int id) throws Exception {
        User admin = (User) getFactory().get(User.class, id);
        return admin;
    }

    @Override
    public List<User> getList() throws Exception {
        List<User> list = getFactory().createQuery("From User a").list();
        return list;
    }

    @Override
    public List<User> advancedSearch(String name) throws Exception {
        List<User> list = getFactory().createQuery("From User u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public User searchForLogin(String email, String pass) throws Exception {
        List<User> list = getFactory().createQuery("From User a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        User temp = null;
        for (User admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<User> getListA(String query) throws Exception {
        List<User> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
