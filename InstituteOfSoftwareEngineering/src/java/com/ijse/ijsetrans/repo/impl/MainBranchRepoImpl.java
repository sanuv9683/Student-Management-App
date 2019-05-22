/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.MainBranch;
import com.ijse.ijsetrans.repo.MainBranchRepo;
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
public class MainBranchRepoImpl implements MainBranchRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(MainBranch dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(MainBranch dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(MainBranch dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(MainBranch dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public MainBranch search(int id) throws Exception {
        MainBranch admin = (MainBranch) getFactory().get(MainBranch.class, id);
        return admin;
    }

    @Override
    public List<MainBranch> getList() throws Exception {
        List<MainBranch> list = getFactory().createQuery("From MainBranch a").list();
        return list;
    }

    @Override
    public List<MainBranch> advancedSearch(String name) throws Exception {
        List<MainBranch> list = getFactory().createQuery("From MainBranch u where u.branchName like '" + name + "%'").list();
        return list;
    }

    @Override
    public MainBranch searchForLogin(String email, String pass) throws Exception {
        List<MainBranch> list = getFactory().createQuery("From MainBranch a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        MainBranch temp = null;
        for (MainBranch admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<MainBranch> getListA(String query) throws Exception {
        List<MainBranch> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
