/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.University;
import com.ijse.ijsetrans.repo.UniversityRepo;
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
public class UniversityRepoImpl implements UniversityRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(University dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(University dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(University dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(University dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public University search(int id) throws Exception {
        University admin = (University) getFactory().get(University.class, id);
        return admin;
    }

    @Override
    public List<University> getList() throws Exception {
        List<University> list = getFactory().createQuery("From University a").list();
        return list;
    }

    @Override
    public List<University> advancedSearch(String name) throws Exception {
        List<University> list = getFactory().createQuery("From University u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public University searchForLogin(String email, String pass) throws Exception {
        List<University> list = getFactory().createQuery("From University a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        University temp = null;
        for (University admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<University> getListA(String query) throws Exception {
        List<University> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
