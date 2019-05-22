/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Notification;
import com.ijse.ijsetrans.repo.NotificationRepo;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sanu
 */
@Repository
public class NotificationRepoImpl implements NotificationRepo {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getFactory() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean add(Notification dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(search(id));
        return true;
    }

    @Override
    public boolean update(Notification dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Notification search(int id) throws Exception {
        Notification get = (Notification) getFactory().get(Notification.class, id);
        return get;
    }

    @Override
    public List<Notification> getList() throws Exception {
        List<Notification> list = getFactory().createQuery("from Notification n").list();
        return list;
    }

    @Override
    public List<Notification> getListA(String query) throws Exception {
        List<Notification> list = getFactory().createQuery(query).list();
        return list;
    }

}
