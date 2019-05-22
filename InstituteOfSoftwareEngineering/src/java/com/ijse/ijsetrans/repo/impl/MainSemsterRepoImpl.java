/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.MainSemesters;
import com.ijse.ijsetrans.repo.MainSemestersRepo;
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
public class MainSemsterRepoImpl implements MainSemestersRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(MainSemesters dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(MainSemesters dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(MainSemesters dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(MainSemesters dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public MainSemesters search(int id) throws Exception {
        MainSemesters admin = (MainSemesters) getFactory().get(MainSemesters.class, id);
        return admin;
    }

    @Override
    public List<MainSemesters> getList() throws Exception {
        List<MainSemesters> list = getFactory().createQuery("From MainSemesters a").list();
        return list;
    }

    @Override
    public List<MainSemesters> advancedSearch(String name) throws Exception {
        List<MainSemesters> list = getFactory().createQuery("From MainSemesters u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public MainSemesters searchForLogin(String email, String pass) throws Exception {
        List<MainSemesters> list = getFactory().createQuery("From MainSemesters a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        MainSemesters temp = null;
        for (MainSemesters admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<MainSemesters> getListA(String query) throws Exception {
        List<MainSemesters> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
