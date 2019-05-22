/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.TextMessage;
import com.ijse.ijsetrans.repo.TextMessageRepo;
import com.ijse.ijsetrans.service.TextMessageService;
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
//@Transactional(propagation = Propagation.REQUIRED)
public class TextMessageServiceImpl implements TextMessageService {

    @Autowired
    private TextMessageRepo tRepo;

    @Override
    public boolean addTextMessage(TextMessage dto) throws Exception {
        return tRepo.add(dto);
    }

    @Override
    public boolean deleteTextMessage(int id) throws Exception {
        return tRepo.delete(id);
    }

    @Override
    public boolean updateTextMessage(TextMessage dto) throws Exception {
        return tRepo.update(dto);
    }

    @Override
    public TextMessage searchTextMessage(int id) throws Exception {
        return tRepo.search(id);
    }

    @Override
    public List<TextMessage> getAllTextMessageList() throws Exception {
        return tRepo.getList();
    }

    @Override
    public List<TextMessage> getListForQuery(String query) throws Exception {
        return tRepo.getListA(query);
    }

}
