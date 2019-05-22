/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.IQTest;
import com.ijse.ijsetrans.repo.IQRepo;
import com.ijse.ijsetrans.service.IQService;
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
public class IQServiceImpl implements IQService {

    @Autowired
    private IQRepo iqRepo;

    @Override
    public boolean addIQTest(IQTest dto) throws Exception {
        return iqRepo.add(dto);
    }

    @Override
    public boolean mergeIQTest(IQTest dto) throws Exception {
        return iqRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateIQTest(IQTest dto) throws Exception {
        return iqRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteIQTest(int id) throws Exception {
        return iqRepo.delete(id);
    }

    @Override
    public boolean updateIQTest(IQTest dto) throws Exception {
        return iqRepo.update(dto);
    }

    @Override
    public IQTest searchIQTest(int id) throws Exception {
        return iqRepo.search(id);
    }

    @Override
    public List<IQTest> getIQTestList() throws Exception {
        return iqRepo.getList();
    }

    @Override
    public List<IQTest> advancedIQTestSearch(String name) throws Exception {
        return iqRepo.advancedSearch(name);
    }

    @Override
    public IQTest searchIQTestForLogin(String email, String pass) throws Exception {
        return iqRepo.searchForLogin(email, pass);
    }

    @Override
    public List<IQTest> getIQTestListA(String query) throws Exception {
        return iqRepo.getListA(query);
    }

    @Override
    public void flushIQTest() throws Exception {
        iqRepo.flush();
    }

}
