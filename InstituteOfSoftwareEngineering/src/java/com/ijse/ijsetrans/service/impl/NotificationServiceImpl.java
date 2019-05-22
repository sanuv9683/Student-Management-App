/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Notification;
import com.ijse.ijsetrans.repo.NotificationRepo;
import com.ijse.ijsetrans.service.NotificationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu
 */
@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepo notyfication;

    @Override
    public boolean addNotification(Notification dto) throws Exception {
        return notyfication.add(dto);
    }

    @Override
    public boolean deleteNotification(int id) throws Exception {
        return notyfication.delete(id);
    }

    @Override
    public boolean updateNotification(Notification dto) throws Exception {
        return notyfication.update(dto);
    }

    @Override
    public Notification searchNotification(int id) throws Exception {
        return notyfication.search(id);
    }

    @Override
    public List<Notification> getNotificationList() throws Exception {
        return notyfication.getList();
    }

    @Override
    public List<Notification> getListForQuery(String query) throws Exception {
        return notyfication.getListA(query);
    }

}
