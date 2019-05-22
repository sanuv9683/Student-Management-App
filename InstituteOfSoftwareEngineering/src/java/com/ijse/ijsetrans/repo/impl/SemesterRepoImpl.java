/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Semester;
import com.ijse.ijsetrans.repo.SemesterRepo;
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
public class SemesterRepoImpl implements SemesterRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Semester dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Semester dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Semester dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Semester dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Semester search(int id) throws Exception {
        Semester admin = (Semester) getFactory().get(Semester.class, id);
        return admin;
    }

    @Override
    public List<Semester> getList() throws Exception {
        List<Semester> list = getFactory().createQuery("From Semester a").list();
        return list;
    }

    @Override
    public List<Semester> advancedSearch(String name) throws Exception {
        List<Semester> list = getFactory().createQuery("From Semester u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Semester searchForLogin(String email, String pass) throws Exception {
        List<Semester> list = getFactory().createQuery("From Semester a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Semester temp = null;
        for (Semester admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Semester> getListA(String query) throws Exception {
        List<Semester> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
