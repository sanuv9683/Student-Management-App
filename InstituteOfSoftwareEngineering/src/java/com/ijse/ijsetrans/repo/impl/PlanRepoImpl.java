/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Plan;
import com.ijse.ijsetrans.repo.PlanRepo;
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
public class PlanRepoImpl implements PlanRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Plan dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Plan dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Plan dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Plan dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Plan search(int id) throws Exception {
        Plan admin = (Plan) getFactory().get(Plan.class, id);
        return admin;
    }

    @Override
    public List<Plan> getList() throws Exception {
        List<Plan> list = getFactory().createQuery("From Plan a").list();
        return list;
    }

    @Override
    public List<Plan> advancedSearch(String name) throws Exception {
        List<Plan> list = getFactory().createQuery("From Plan u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Plan searchForLogin(String email, String pass) throws Exception {
        List<Plan> list = getFactory().createQuery("From Plan a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Plan temp = null;
        for (Plan admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Plan> getListA(String query) throws Exception {
        List<Plan> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
