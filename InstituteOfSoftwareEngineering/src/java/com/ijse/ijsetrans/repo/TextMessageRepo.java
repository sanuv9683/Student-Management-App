/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.TextMessage;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface TextMessageRepo {
    public boolean add(TextMessage dto) throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(TextMessage dto) throws Exception;
    public TextMessage search(int id) throws Exception;
    public List<TextMessage> getList() throws Exception;
    public List<TextMessage> getListA(String query) throws Exception; 
}
