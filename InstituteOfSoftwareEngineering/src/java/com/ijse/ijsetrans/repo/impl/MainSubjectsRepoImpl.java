/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.MainSubjects;
import com.ijse.ijsetrans.repo.MainSubjectRepo;
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
public class MainSubjectsRepoImpl implements MainSubjectRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(MainSubjects dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(MainSubjects dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(MainSubjects dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(MainSubjects dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public MainSubjects search(int id) throws Exception {
        MainSubjects admin = (MainSubjects) getFactory().get(MainSubjects.class, id);
        return admin;
    }

    @Override
    public List<MainSubjects> getList() throws Exception {
        List<MainSubjects> list = getFactory().createQuery("From MainSubjects a").list();
        return list;
    }

    @Override
    public List<MainSubjects> advancedSearch(String name) throws Exception {
        List<MainSubjects> list = getFactory().createQuery("From MainSubjects u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public MainSubjects searchForLogin(String email, String pass) throws Exception {
        List<MainSubjects> list = getFactory().createQuery("From MainSubjects a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        MainSubjects temp = null;
        for (MainSubjects admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<MainSubjects> getListA(String query) throws Exception {
        List<MainSubjects> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
