/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.School;
import com.ijse.ijsetrans.repo.SchoolRepo;
import com.ijse.ijsetrans.service.SchoolService;
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
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    @Override
    public boolean addSchool(School dto) throws Exception {
        return schoolRepo.add(dto);
    }

    @Override
    public boolean mergeSchool(School dto) throws Exception {
        return schoolRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateSchool(School dto) throws Exception {
        return schoolRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteSchool(int id) throws Exception {
        return schoolRepo.delete(id);
    }

    @Override
    public boolean updateSchool(School dto) throws Exception {
        return schoolRepo.update(dto);
    }

    @Override
    public School searchSchool(int id) throws Exception {
        return schoolRepo.search(id);
    }

    @Override
    public List<School> getSchoolList() throws Exception {
        return schoolRepo.getList();
    }

    @Override
    public List<School> advancedSchoolSearch(String name) throws Exception {
        return schoolRepo.advancedSearch(name);
    }

    @Override
    public School searchSchoolForLogin(String email, String pass) throws Exception {
        return schoolRepo.searchForLogin(email, pass);
    }

    @Override
    public List<School> getSchoolListA(String query) throws Exception {
        return schoolRepo.getListA(query);
    }

    @Override
    public void flushSchool() throws Exception {
        schoolRepo.flush();
    }

}
