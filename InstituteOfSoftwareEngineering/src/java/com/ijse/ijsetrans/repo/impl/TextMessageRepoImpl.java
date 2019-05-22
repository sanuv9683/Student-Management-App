/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.TextMessage;
import com.ijse.ijsetrans.repo.TextMessageRepo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sanu
 */
@Repository
public class TextMessageRepoImpl implements TextMessageRepo {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getFactory() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean add(TextMessage dto) throws Exception {
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
    public boolean update(TextMessage dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public TextMessage search(int id) throws Exception {
        TextMessage get = (TextMessage) getFactory().get(TextMessage.class, id);
        return get;
    }

    @Override
    public List<TextMessage> getList() throws Exception {
        List<TextMessage> list = getFactory().createQuery("from TextMessage s").list();
        return list;
    }

    @Override
    public List<TextMessage> getListA(String query) throws Exception {
        List<TextMessage> list = getFactory().createQuery(query).list();
        return list;
    }

}
