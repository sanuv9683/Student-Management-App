/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.School;
import com.ijse.ijsetrans.repo.SchoolRepo;
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
public class SchoolRepoImpl implements SchoolRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(School dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(School dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(School dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(School dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public School search(int id) throws Exception {
        School admin = (School) getFactory().get(School.class, id);
        return admin;
    }

    @Override
    public List<School> getList() throws Exception {
        List<School> list = getFactory().createQuery("From School a").list();
        return list;
    }

    @Override
    public List<School> advancedSearch(String name) throws Exception {
        List<School> list = getFactory().createQuery("From School u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public School searchForLogin(String email, String pass) throws Exception {
        List<School> list = getFactory().createQuery("From School a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        School temp = null;
        for (School admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<School> getListA(String query) throws Exception {
        List<School> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
