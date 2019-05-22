/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Projects;
import com.ijse.ijsetrans.repo.ProjectsRepo;
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
public class ProjectsRepoImpl implements ProjectsRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Projects dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Projects dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Projects dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Projects dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Projects search(int id) throws Exception {
        Projects admin = (Projects) getFactory().get(Projects.class, id);
        return admin;
    }

    @Override
    public List<Projects> getList() throws Exception {
        List<Projects> list = getFactory().createQuery("From Projects a").list();
        return list;
    }

    @Override
    public List<Projects> advancedSearch(String name) throws Exception {
        List<Projects> list = getFactory().createQuery("From Projects u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Projects searchForLogin(String email, String pass) throws Exception {
        List<Projects> list = getFactory().createQuery("From Projects a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Projects temp = null;
        for (Projects admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Projects> getListA(String query) throws Exception {
        List<Projects> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
