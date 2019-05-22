/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Notification;
import java.util.List;



/**
 *
 * @author Sanu
 */
public interface NotificationRepo {
    public boolean add(Notification dto) throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Notification dto) throws Exception;
    public Notification search(int id) throws Exception;
    public List<Notification> getList() throws Exception; 
    public List<Notification> getListA(String query) throws Exception; 
}
