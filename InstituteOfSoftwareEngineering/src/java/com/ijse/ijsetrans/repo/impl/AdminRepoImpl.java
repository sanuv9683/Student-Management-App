/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.repo.AdminRepo;
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
public class AdminRepoImpl implements AdminRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Admin dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Admin dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Admin dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Admin dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Admin search(int id) throws Exception {
        Admin admin = (Admin) getFactory().get(Admin.class, id);
        return admin;
    }

    @Override
    public List<Admin> getList() throws Exception {
        List<Admin> list = getFactory().createQuery("From Admin a").list();
        return list;
    }

    @Override
    public List<Admin> advancedSearch(String name) throws Exception {
        List<Admin> list = getFactory().createQuery("From Admin u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Admin searchForLogin(String email, String pass) throws Exception {
        List<Admin> list = getFactory().createQuery("From Admin a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Admin temp = null;
        for (Admin admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Admin> getListA(String query) throws Exception {
        List<Admin> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
