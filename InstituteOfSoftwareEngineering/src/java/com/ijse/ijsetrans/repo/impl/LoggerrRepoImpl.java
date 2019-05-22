/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Loggerr;
import com.ijse.ijsetrans.repo.LoggerrRepo;
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
public class LoggerrRepoImpl implements LoggerrRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Loggerr dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Loggerr dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Loggerr dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Loggerr dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Loggerr search(int id) throws Exception {
        Loggerr admin = (Loggerr) getFactory().get(Loggerr.class, id);
        return admin;
    }

    @Override
    public List<Loggerr> getList() throws Exception {
        List<Loggerr> list = getFactory().createQuery("From Loggerr a").list();
        return list;
    }

    @Override
    public List<Loggerr> advancedSearch(String name) throws Exception {
        List<Loggerr> list = getFactory().createQuery("From Loggerr u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Loggerr searchForLogin(String email, String pass) throws Exception {
        List<Loggerr> list = getFactory().createQuery("From Loggerr a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Loggerr temp = null;
        for (Loggerr admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Loggerr> getListA(String query) throws Exception {
        List<Loggerr> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
