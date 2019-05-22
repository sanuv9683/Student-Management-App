/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Branch;
import com.ijse.ijsetrans.repo.BranchRepo;
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
public class BranchRepoImpl implements BranchRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Branch dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Branch dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Branch dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Branch dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Branch search(int id) throws Exception {
        Branch admin = (Branch) getFactory().get(Branch.class, id);
        return admin;

    }

    @Override
    public List<Branch> getList() throws Exception {
        List<Branch> list = getFactory().createQuery("From Branch a").list();
        return list;
    }

    @Override
    public List<Branch> advancedSearch(String name) throws Exception {
        List<Branch> list = getFactory().createQuery("From Branch u where u.branchName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Branch searchForLogin(String email, String pass) throws Exception {
        List<Branch> list = getFactory().createQuery("From Branch a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Branch temp = null;
        for (Branch admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Branch> getListA(String query) throws Exception {
        List<Branch> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
