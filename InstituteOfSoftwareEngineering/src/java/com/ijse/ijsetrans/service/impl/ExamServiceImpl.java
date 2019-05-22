/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Exam;
import com.ijse.ijsetrans.repo.ExamRepo;
import com.ijse.ijsetrans.service.ExamService;
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
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepo examRepo;

    @Override
    public boolean addExam(Exam dto) throws Exception {
        return examRepo.add(dto);
    }

    @Override
    public boolean mergeExam(Exam dto) throws Exception {
        return examRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateExam(Exam dto) throws Exception {
        return examRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteExam(int id) throws Exception {
        return examRepo.delete(id);
    }

    @Override
    public boolean updateExam(Exam dto) throws Exception {
        return examRepo.update(dto);
    }

    @Override
    public Exam searchExam(int id) throws Exception {
        return examRepo.search(id);
    }

    @Override
    public List<Exam> getExamList() throws Exception {
        return examRepo.getList();
    }

    @Override
    public List<Exam> advancedExamSearch(String name) throws Exception {
        return examRepo.advancedSearch(name);
    }

    @Override
    public Exam searchExamForLogin(String email, String pass) throws Exception {
        return examRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Exam> getExamListA(String query) throws Exception {
        return examRepo.getListA(query);
    }

    @Override
    public void flushExam() throws Exception {
         examRepo.flush();
    }

}
