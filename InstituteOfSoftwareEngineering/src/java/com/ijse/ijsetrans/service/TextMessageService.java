/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.TextMessage;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface TextMessageService {
    public boolean addTextMessage(TextMessage dto) throws Exception;
    public boolean deleteTextMessage(int id) throws Exception;
    public boolean updateTextMessage(TextMessage dto) throws Exception;
    public TextMessage searchTextMessage(int id) throws Exception;
    public List<TextMessage> getAllTextMessageList() throws Exception; 
    public List<TextMessage> getListForQuery(String query) throws Exception; 
}
