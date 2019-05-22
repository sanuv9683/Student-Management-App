/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Message;
import com.ijse.ijsetrans.repo.MessageRepo;
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
//@Transactional(propagation = Propagation.SUPPORTS)
public class MessageRepoImpl implements MessageRepo {

//    @Autowired
//    private HibernateTemplate hibTemplate;
    @Autowired
    private SessionFactory sessionFactory;

    private Session getFactory() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean add(Message dto) throws Exception {
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
    public boolean update(Message dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Message search(int id) throws Exception {
        Message get = (Message) getFactory().get(Message.class, id);
        return get;
    }

    @Override
    public List<Message> getList() throws Exception {
        List<Message> list = getFactory().createQuery("from Message m").list();
        return list;
    }

    @Override
    public List<Message> getListA(String query) throws Exception {
        List<Message> list = getFactory().createQuery(query).list();
        return list;
    }

}
