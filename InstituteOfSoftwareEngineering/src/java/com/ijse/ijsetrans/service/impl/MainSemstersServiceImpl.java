/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.MainSemesters;
import com.ijse.ijsetrans.repo.MainSemestersRepo;
import com.ijse.ijsetrans.service.MainSemestersService;
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
public class MainSemstersServiceImpl implements MainSemestersService {

    @Autowired
    private MainSemestersRepo adminRepo;

    @Override
    public boolean addMainSemesters(MainSemesters dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeMainSemesters(MainSemesters dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateMainSemesters(MainSemesters dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteMainSemesters(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateMainSemesters(MainSemesters dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public MainSemesters searchMainSemesters(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<MainSemesters> getMainSemestersList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<MainSemesters> advancedMainSemestersSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public MainSemesters searchMainSemestersForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<MainSemesters> getMainSemestersListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushMainSemesters() throws Exception {
        adminRepo.flush();
    }

}
