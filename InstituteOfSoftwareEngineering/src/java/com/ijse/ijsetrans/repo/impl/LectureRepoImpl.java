/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Lectures;
import com.ijse.ijsetrans.repo.LectureRepo;
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
public class LectureRepoImpl implements LectureRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Lectures dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Lectures dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Lectures dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Lectures dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Lectures search(int id) throws Exception {
        Lectures admin = (Lectures) getFactory().get(Lectures.class, id);
        return admin;
    }

    @Override
    public List<Lectures> getList() throws Exception {
        List<Lectures> list = getFactory().createQuery("From Lectures a").list();
        return list;
    }

    @Override
    public List<Lectures> advancedSearch(String name) throws Exception {
        List<Lectures> list = getFactory().createQuery("From Lectures u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Lectures searchForLogin(String email, String pass) throws Exception {
        List<Lectures> list = getFactory().createQuery("From Lectures a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Lectures temp = null;
        for (Lectures admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Lectures> getListA(String query) throws Exception {
        List<Lectures> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
