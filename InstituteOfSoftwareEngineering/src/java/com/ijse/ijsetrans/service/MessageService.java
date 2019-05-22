/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Message;
import java.util.List;




/**
 *
 * @author Sanu
 */
public interface MessageService  {
    public boolean addMessage(Message dto) throws Exception;
    public boolean deleteMessage(int id) throws Exception;
    public boolean updateMessage(Message dto) throws Exception;
    public Message searchMessage(int id) throws Exception;
    public List<Message> getMessageList() throws Exception; 
    public List<Message> getListForQuery(String query) throws Exception; 
}
