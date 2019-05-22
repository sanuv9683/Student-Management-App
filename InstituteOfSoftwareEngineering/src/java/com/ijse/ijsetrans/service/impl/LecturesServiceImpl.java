/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Lectures;
import com.ijse.ijsetrans.repo.LectureRepo;
import com.ijse.ijsetrans.service.LectureService;
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
public class LecturesServiceImpl implements LectureService {

    @Autowired
    private LectureRepo adminRepo;

    @Override
    public boolean addLectures(Lectures dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeLectures(Lectures dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateLectures(Lectures dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteLectures(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateLectures(Lectures dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public Lectures searchLectures(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<Lectures> getLecturesList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<Lectures> advancedLecturesSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public Lectures searchLecturesForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Lectures> getLecturesListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushLectures() throws Exception {
        adminRepo.flush();
    }

}
