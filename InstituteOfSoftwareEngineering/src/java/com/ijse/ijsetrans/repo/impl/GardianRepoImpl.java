/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Gardian;
import com.ijse.ijsetrans.repo.GardianRepo;
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
public class GardianRepoImpl implements GardianRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Gardian dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Gardian dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Gardian dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Gardian dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Gardian search(int id) throws Exception {
        Gardian admin = (Gardian) getFactory().get(Gardian.class, id);
        return admin;
    }

    @Override
    public List<Gardian> getList() throws Exception {
        List<Gardian> list = getFactory().createQuery("From Gardian a").list();
        return list;
    }

    @Override
    public List<Gardian> advancedSearch(String name) throws Exception {
        List<Gardian> list = getFactory().createQuery("From Gardian u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Gardian searchForLogin(String email, String pass) throws Exception {
        List<Gardian> list = getFactory().createQuery("From Gardian a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Gardian temp = null;
        for (Gardian admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Gardian> getListA(String query) throws Exception {
        List<Gardian> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
