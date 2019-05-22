/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.MainSubjects;
import com.ijse.ijsetrans.repo.MainSubjectRepo;
import com.ijse.ijsetrans.service.MainSubjectsService;
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
public class MainSubjectsServiceImpl implements MainSubjectsService {

    @Autowired
    private MainSubjectRepo adminRepo;

    @Override
    public boolean addMainSubjects(MainSubjects dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeMainSubjects(MainSubjects dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateMainSubjects(MainSubjects dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteMainSubjects(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateMainSubjects(MainSubjects dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public MainSubjects searchMainSubjects(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<MainSubjects> getMainSubjectsList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<MainSubjects> advancedMainSubjectsSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public MainSubjects searchMainSubjectsForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<MainSubjects> getMainSubjectsListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushMainSubjects() throws Exception {
        adminRepo.flush();
    }

}
