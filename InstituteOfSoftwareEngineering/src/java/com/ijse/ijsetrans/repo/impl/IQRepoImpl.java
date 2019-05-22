/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.IQTest;
import com.ijse.ijsetrans.repo.IQRepo;
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
public class IQRepoImpl implements IQRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(IQTest dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(IQTest dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(IQTest dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(IQTest dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public IQTest search(int id) throws Exception {
        IQTest admin = (IQTest) getFactory().get(IQTest.class, id);
        return admin;
    }

    @Override
    public List<IQTest> getList() throws Exception {
        List<IQTest> list = getFactory().createQuery("From IQTest a").list();
        return list;
    }

    @Override
    public List<IQTest> advancedSearch(String name) throws Exception {
        List<IQTest> list = getFactory().createQuery("From IQTest u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public IQTest searchForLogin(String email, String pass) throws Exception {
        List<IQTest> list = getFactory().createQuery("From IQTest a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        IQTest temp = null;
        for (IQTest admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<IQTest> getListA(String query) throws Exception {
        List<IQTest> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
