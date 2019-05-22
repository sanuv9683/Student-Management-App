/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Semester;
import com.ijse.ijsetrans.repo.SemesterRepo;
import com.ijse.ijsetrans.service.SemesterService;
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
public class SemesterServiceImpl implements SemesterService{
    
    @Autowired
    private SemesterRepo semesterRepo;

    @Override
    public boolean addSemester(Semester dto) throws Exception {
        return semesterRepo.add(dto);
    }

    @Override
    public boolean mergeSemester(Semester dto) throws Exception {
        return semesterRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateSemester(Semester dto) throws Exception {
        return semesterRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteSemester(int id) throws Exception {
        return semesterRepo.delete(id);
    }

    @Override
    public boolean updateSemester(Semester dto) throws Exception {
        return semesterRepo.update(dto);
    }

    @Override
    public Semester searchSemester(int id) throws Exception {
        return semesterRepo.search(id);
    }

    @Override
    public List<Semester> getSemesterList() throws Exception {
        return semesterRepo.getList();
    }

    @Override
    public List<Semester> advancedSemesterSearch(String name) throws Exception {
        return semesterRepo.advancedSearch(name);
    }

    @Override
    public Semester searchSemesterForLogin(String email, String pass) throws Exception {
        return semesterRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Semester> getSemesterListA(String query) throws Exception {
        return semesterRepo.getListA(query);
    }

    @Override
    public void flushSemester() throws Exception {
         semesterRepo.flush();
    }
    
}
