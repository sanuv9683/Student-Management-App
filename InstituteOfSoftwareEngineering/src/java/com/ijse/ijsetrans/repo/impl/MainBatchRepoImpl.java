/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.MainBatch;
import com.ijse.ijsetrans.repo.MainBatchRepo;
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
public class MainBatchRepoImpl implements MainBatchRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(MainBatch dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(MainBatch dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(MainBatch dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(MainBatch dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public MainBatch search(int id) throws Exception {
        MainBatch admin = (MainBatch) getFactory().get(MainBatch.class, id);
        return admin;
    }

    @Override
    public List<MainBatch> getList() throws Exception {
        List<MainBatch> list = getFactory().createQuery("From MainBatch a").list();
        return list;
    }

    @Override
    public List<MainBatch> advancedSearch(String name) throws Exception {
        List<MainBatch> list = getFactory().createQuery("From MainBatch u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public MainBatch searchForLogin(String email, String pass) throws Exception {
        List<MainBatch> list = getFactory().createQuery("From MainBatch a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        MainBatch temp = null;
        for (MainBatch admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<MainBatch> getListA(String query) throws Exception {
        List<MainBatch> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
