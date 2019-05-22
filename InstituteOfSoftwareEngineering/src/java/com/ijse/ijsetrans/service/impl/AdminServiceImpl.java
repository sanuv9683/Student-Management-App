/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.repo.AdminRepo;
import com.ijse.ijsetrans.service.AdminService;
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
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public boolean addAdmin(Admin dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeAdmin(Admin dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateAdmin(Admin dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteAdmin(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateAdmin(Admin dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public Admin searchAdmin(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<Admin> getAdminList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<Admin> advancedAdminSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public Admin searchAdminForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Admin> getAdminListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushAdmin() throws Exception {
        adminRepo.flush();
    }

}
