/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.University;
import com.ijse.ijsetrans.repo.UniversityRepo;
import com.ijse.ijsetrans.service.UniversityService;
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
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepo universityRepo;

    @Override
    public boolean addUniversity(University dto) throws Exception {
        return universityRepo.add(dto);
    }

    @Override
    public boolean mergeUniversity(University dto) throws Exception {
        return universityRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateUniversity(University dto) throws Exception {
        return universityRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteUniversity(int id) throws Exception {
        return universityRepo.delete(id);
    }

    @Override
    public boolean updateUniversity(University dto) throws Exception {
        return universityRepo.update(dto);
    }

    @Override
    public University searchUniversity(int id) throws Exception {
        return universityRepo.search(id);
    }

    @Override
    public List<University> getUniversityList() throws Exception {
        return universityRepo.getList();
    }

    @Override
    public List<University> advancedUniversitySearch(String name) throws Exception {
        return universityRepo.advancedSearch(name);
    }

    @Override
    public University searchUniversityForLogin(String email, String pass) throws Exception {
        return universityRepo.searchForLogin(email, pass);
    }

    @Override
    public List<University> getUniversityListA(String query) throws Exception {
        return universityRepo.getListA(query);
    }

    @Override
    public void flushUniversity() throws Exception {
        universityRepo.flush();
    }

}
