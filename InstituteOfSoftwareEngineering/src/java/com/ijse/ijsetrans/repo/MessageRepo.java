/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Message;
import java.util.List;


/**
 *
 * @author Sanu
 */
public interface MessageRepo  {
    public boolean add(Message dto) throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Message dto) throws Exception;
    public Message search(int id) throws Exception;
    public List<Message> getList() throws Exception; 
    public List<Message> getListA(String query) throws Exception; 
}
