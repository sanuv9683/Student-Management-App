/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Batch;
import com.ijse.ijsetrans.repo.BatchRepo;
import com.ijse.ijsetrans.service.BatchService;
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
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchRepo batchRepo;

    @Override
    public boolean addBatch(Batch dto) throws Exception {
        return batchRepo.add(dto);
    }

    @Override
    public boolean mergeBatch(Batch dto) throws Exception {
        return batchRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateBatch(Batch dto) throws Exception {
        return batchRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteBatch(int id) throws Exception {
        return batchRepo.delete(id);
    }

    @Override
    public boolean updateBatch(Batch dto) throws Exception {
        return batchRepo.update(dto);
    }

    @Override
    public Batch searchBatch(String id) throws Exception {
        return batchRepo.search(id);
    }

    @Override
    public List<Batch> getBatchList() throws Exception {
        return batchRepo.getList();
    }

    @Override
    public List<Batch> advancedBatchSearch(String name) throws Exception {
        return batchRepo.advancedSearch(name);
    }

    @Override
    public Batch searchBatchForLogin(String email, String pass) throws Exception {
        return batchRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Batch> getBatchListA(String query) throws Exception {
        return batchRepo.getListA(query);
    }

    @Override
    public void flushBatch() throws Exception {
        batchRepo.flush();
    }

}
