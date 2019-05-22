/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Subject;
import com.ijse.ijsetrans.repo.SubjectRepo;
import com.ijse.ijsetrans.service.SubjectService;
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
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public boolean addSubject(Subject dto) throws Exception {
        return subjectRepo.add(dto);
    }

    @Override
    public boolean mergeSubject(Subject dto) throws Exception {
        return subjectRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateSubject(Subject dto) throws Exception {
        return subjectRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteSubject(int id) throws Exception {
        return subjectRepo.delete(id);
    }

    @Override
    public boolean updateSubject(Subject dto) throws Exception {
        return subjectRepo.update(dto);
    }

    @Override
    public Subject searchSubject(int id) throws Exception {
        return subjectRepo.search(id);
    }

    @Override
    public List<Subject> getSubjectList() throws Exception {
        return subjectRepo.getList();
    }

    @Override
    public List<Subject> advancedSubjectSearch(String name) throws Exception {
        return subjectRepo.advancedSearch(name);
    }

    @Override
    public Subject searchSubjectForLogin(String email, String pass) throws Exception {
        return subjectRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Subject> getSubjectListA(String query) throws Exception {
        return subjectRepo.getListA(query);
    }

    @Override
    public void flushSubject() throws Exception {
        subjectRepo.flush();
    }

}
