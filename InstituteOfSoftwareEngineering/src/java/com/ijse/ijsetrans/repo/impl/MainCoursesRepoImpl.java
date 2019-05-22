/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.MainCourses;
import com.ijse.ijsetrans.repo.MainCourseRepo;
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
public class MainCoursesRepoImpl implements MainCourseRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(MainCourses dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(MainCourses dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(MainCourses dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(MainCourses dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public MainCourses search(int id) throws Exception {
        MainCourses admin = (MainCourses) getFactory().get(MainCourses.class, id);
        return admin;
    }

    @Override
    public List<MainCourses> getList() throws Exception {
        List<MainCourses> list = getFactory().createQuery("From MainCourses a").list();
        return list;
    }

    @Override
    public List<MainCourses> advancedSearch(String name) throws Exception {
        List<MainCourses> list = getFactory().createQuery("From MainCourses u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public MainCourses searchForLogin(String email, String pass) throws Exception {
        List<MainCourses> list = getFactory().createQuery("From MainCourses a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        MainCourses temp = null;
        for (MainCourses admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<MainCourses> getListA(String query) throws Exception {
        List<MainCourses> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
