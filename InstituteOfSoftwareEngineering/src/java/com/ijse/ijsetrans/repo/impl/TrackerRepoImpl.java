/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Tracker;
import com.ijse.ijsetrans.repo.TrackerRepo;
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
public class TrackerRepoImpl implements TrackerRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Tracker dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Tracker dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Tracker dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Tracker dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Tracker search(int id) throws Exception {
        Tracker admin = (Tracker) getFactory().get(Tracker.class, id);
        return admin;
    }

    @Override
    public List<Tracker> getList() throws Exception {
        List<Tracker> list = getFactory().createQuery("From Tracker a").list();
        return list;
    }

    @Override
    public List<Tracker> advancedSearch(String name) throws Exception {
        List<Tracker> list = getFactory().createQuery("From Tracker u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Tracker searchForLogin(String email, String pass) throws Exception {
        List<Tracker> list = getFactory().createQuery("From Tracker a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Tracker temp = null;
        for (Tracker admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Tracker> getListA(String query) throws Exception {
        List<Tracker> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
