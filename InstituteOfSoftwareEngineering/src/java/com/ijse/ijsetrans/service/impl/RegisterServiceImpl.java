/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Register;
import com.ijse.ijsetrans.repo.RegisterRepo;
import com.ijse.ijsetrans.service.RegisterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu Vithanage
 */
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepo regRepo;

    @Override
    public boolean addRegister(Register dto) throws Exception {
        return regRepo.add(dto);
    }

    @Override
    public boolean mergeRegister(Register dto) throws Exception {
        return regRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateRegister(Register dto) throws Exception {
        return regRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteRegister(int id) throws Exception {
        return regRepo.delete(id);
    }

    @Override
    public boolean updateRegister(Register dto) throws Exception {
        return regRepo.update(dto);
    }

    @Override
    public Register searchRegister(int id) throws Exception {
        return regRepo.search(id);
    }

    @Override
    public List<Register> getRegisterList() throws Exception {
        return regRepo.getList();
    }

    @Override
    public List<Register> advancedRegisterSearch(String name) throws Exception {
        return regRepo.advancedSearch(name);
    }

    @Override
    public Register searchRegisterForLogin(String email, String pass) throws Exception {
        return regRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Register> getRegisterListA(String query) throws Exception {
        return regRepo.getListA(query);
    }

    @Override
    public void flushRegister() throws Exception {
        regRepo.flush();
    }

}
