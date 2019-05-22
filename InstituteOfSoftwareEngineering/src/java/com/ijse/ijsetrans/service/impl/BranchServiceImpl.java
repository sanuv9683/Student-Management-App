/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Branch;
import com.ijse.ijsetrans.repo.BranchRepo;
import com.ijse.ijsetrans.service.BranchService;
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
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepo brachRepo;

    @Override
    public boolean addBranch(Branch dto) throws Exception {
        return brachRepo.add(dto);
    }

    @Override
    public boolean mergeBranch(Branch dto) throws Exception {
        return brachRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateBranch(Branch dto) throws Exception {
        return brachRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteBranch(int id) throws Exception {
        return brachRepo.delete(id);
    }

    @Override
    public boolean updateBranch(Branch dto) throws Exception {
        return brachRepo.update(dto);
    }

    @Override
    public Branch searchBranch(int id) throws Exception {
        return brachRepo.search(id);
    }

    @Override
    public List<Branch> getBranchList() throws Exception {
        return brachRepo.getList();
    }

    @Override
    public List<Branch> advancedBranchSearch(String name) throws Exception {
        return brachRepo.advancedSearch(name);
    }

    @Override
    public Branch searchBranchForLogin(String email, String pass) throws Exception {
        return brachRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Branch> getBranchListA(String query) throws Exception {
        return brachRepo.getListA(query);
    }

    @Override
    public void flushBranch() throws Exception {
        brachRepo.flush();
    }

}
