/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Register;
import com.ijse.ijsetrans.repo.RegisterRepo;
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
public class RegisterRepoImpl implements RegisterRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Register dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Register dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Register dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Register dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Register search(int id) throws Exception {
        Register admin = (Register) getFactory().get(Register.class, id);
        return admin;
    }

    @Override
    public List<Register> getList() throws Exception {
        List<Register> list = getFactory().createQuery("From Register a").list();
        return list;
    }

    @Override
    public List<Register> advancedSearch(String name) throws Exception {
        List<Register> list = getFactory().createQuery("From Register u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Register searchForLogin(String email, String pass) throws Exception {
        List<Register> list = getFactory().createQuery("From Register a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Register temp = null;
        for (Register admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Register> getListA(String query) throws Exception {
        List<Register> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
