/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Batch;
import com.ijse.ijsetrans.repo.BatchRepo;
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
public class BatchRepoImpl implements BatchRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Batch dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Batch dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Batch dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Batch dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Batch search(String id) throws Exception {
        Batch admin = (Batch) getFactory().get(Batch.class, id);
        return admin;
    }

    @Override
    public List<Batch> getList() throws Exception {
        List<Batch> list = getFactory().createQuery("From Batch a").list();
        return list;
    }

    @Override
    public List<Batch> advancedSearch(String name) throws Exception {
        List<Batch> list = getFactory().createQuery("From Batch u where u.batchID like '" + name + "%'").list();
        return list;
    }

    @Override
    public Batch searchForLogin(String email, String pass) throws Exception {
        List<Batch> list = getFactory().createQuery("From Batch a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Batch temp = null;
        for (Batch admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Batch> getListA(String query) throws Exception {
        List<Batch> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
