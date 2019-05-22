/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Notification;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface NotificationService {
    public boolean addNotification(Notification dto) throws Exception;
    public boolean deleteNotification(int id) throws Exception;
    public boolean updateNotification(Notification dto) throws Exception;
    public Notification searchNotification(int id) throws Exception;
    public List<Notification> getNotificationList() throws Exception; 
    public List<Notification> getListForQuery(String query) throws Exception; 
}
