/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.core.Payment;
import com.ijse.ijsetrans.repo.PaymentRepo;
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
public class PaymentRepoImpl implements PaymentRepo {

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Payment dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Payment dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Payment dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Payment dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Payment search(int id) throws Exception {
        Payment admin = (Payment) getFactory().get(Payment.class, id);
        return admin;
    }

    @Override
    public List<Payment> getList() throws Exception {
        List<Payment> list = getFactory().createQuery("From Payment a").list();
        return list;
    }

    @Override
    public List<Payment> advancedSearch(String name) throws Exception {
        List<Payment> list = getFactory().createQuery("From Payment u where u.firstName like '" + name + "%' or u.email like '" + name + "%' or u.lastName like '" + name + "%'").list();
        return list;
    }

    @Override
    public Payment searchForLogin(String email, String pass) throws Exception {
        List<Payment> list = getFactory().createQuery("From Payment a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Payment temp = null;
        for (Payment admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Payment> getListA(String query) throws Exception {
        List<Payment> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
