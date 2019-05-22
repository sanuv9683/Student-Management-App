/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Subject;
import com.ijse.ijsetrans.repo.SubjectRepo;
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
public class SubjectRepoImpl implements SubjectRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Subject dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Subject dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Subject dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Subject dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Subject search(int id) throws Exception {
        Subject admin = (Subject) getFactory().get(Subject.class, id);
        return admin;
    }

    @Override
    public List<Subject> getList() throws Exception {
        List<Subject> list = getFactory().createQuery("From Subject a").list();
        return list;
    }

    @Override
    public List<Subject> advancedSearch(String name) throws Exception {
        List<Subject> list = getFactory().createQuery("From Subject u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Subject searchForLogin(String email, String pass) throws Exception {
        List<Subject> list = getFactory().createQuery("From Subject a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Subject temp = null;
        for (Subject admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Subject> getListA(String query) throws Exception {
        List<Subject> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
