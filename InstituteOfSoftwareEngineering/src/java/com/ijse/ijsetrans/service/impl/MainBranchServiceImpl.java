/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.MainBranch;
import com.ijse.ijsetrans.repo.MainBranchRepo;
import com.ijse.ijsetrans.service.MainBranchService;
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
public class MainBranchServiceImpl implements MainBranchService {

    @Autowired
    private MainBranchRepo adminRepo;

    @Override
    public boolean addMainBranch(MainBranch dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeMainBranch(MainBranch dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateMainBranch(MainBranch dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteMainBranch(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateMainBranch(MainBranch dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public MainBranch searchMainBranch(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<MainBranch> getMainBranchList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<MainBranch> advancedMainBranchSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public MainBranch searchMainBranchForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<MainBranch> getMainBranchListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushMainBranch() throws Exception {
        adminRepo.flush();
    }

}
