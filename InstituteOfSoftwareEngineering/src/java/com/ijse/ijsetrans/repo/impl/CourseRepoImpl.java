/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.repo.CourseRepo;
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
public class CourseRepoImpl implements CourseRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Course dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Course dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Course dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Course dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Course search(int id) throws Exception {
        Course admin = (Course) getFactory().get(Course.class, id);
        return admin;
    }

    @Override
    public List<Course> getList() throws Exception {
        List<Course> list = getFactory().createQuery("From Course a").list();
        return list;
    }

    @Override
    public List<Course> advancedSearch(String name) throws Exception {
        List<Course> list = getFactory().createQuery("From Course u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Course searchForLogin(String email, String pass) throws Exception {
        List<Course> list = getFactory().createQuery("From Course a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Course temp = null;
        for (Course admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Course> getListA(String query) throws Exception {
        List<Course> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
