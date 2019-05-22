/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Clases;
import com.ijse.ijsetrans.repo.ClasesRepo;
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
public class ClasesRepoImpl implements ClasesRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Clases dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Clases dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Clases dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Clases dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Clases search(int id) throws Exception {
        Clases admin = (Clases) getFactory().get(Clases.class, id);
        return admin;
    }

    @Override
    public List<Clases> getList() throws Exception {
        List<Clases> list = getFactory().createQuery("From Clases a").list();
        return list;
    }

    @Override
    public List<Clases> advancedSearch(String name) throws Exception {
        List<Clases> list = getFactory().createQuery("From Clases u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Clases searchForLogin(String email, String pass) throws Exception {
        List<Clases> list = getFactory().createQuery("From Clases a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Clases temp = null;
        for (Clases admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Clases> getListA(String query) throws Exception {
        List<Clases> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
