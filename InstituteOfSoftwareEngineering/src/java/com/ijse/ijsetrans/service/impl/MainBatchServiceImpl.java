/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.MainBatch;
import com.ijse.ijsetrans.repo.MainBatchRepo;
import com.ijse.ijsetrans.service.MainBatchService;
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
public class MainBatchServiceImpl implements MainBatchService {

    @Autowired
    private MainBatchRepo adminRepo;

    @Override
    public boolean addMainBatch(MainBatch dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeMainBatch(MainBatch dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateMainBatch(MainBatch dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteMainBatch(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateMainBatch(MainBatch dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public MainBatch searchMainBatch(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<MainBatch> getMainBatchList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<MainBatch> advancedMainBatchSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public MainBatch searchMainBatchForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<MainBatch> getMainBatchListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushMainBatch() throws Exception {
        adminRepo.flush();
    }

}
