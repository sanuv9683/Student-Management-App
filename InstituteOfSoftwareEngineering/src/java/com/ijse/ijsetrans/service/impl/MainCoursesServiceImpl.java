/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.MainCourses;
import com.ijse.ijsetrans.repo.MainCourseRepo;
import com.ijse.ijsetrans.service.MainCoursesService;
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
public class MainCoursesServiceImpl implements MainCoursesService {

    @Autowired
    private MainCourseRepo adminRepo;

    @Override
    public boolean addMainCourses(MainCourses dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeMainCourses(MainCourses dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateMainCourses(MainCourses dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteMainCourses(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateMainCourses(MainCourses dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public MainCourses searchMainCourses(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<MainCourses> getMainCoursesList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<MainCourses> advancedMainCoursesSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public MainCourses searchMainCoursesForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<MainCourses> getMainCoursesListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushMainCourses() throws Exception {
        adminRepo.flush();
    }

}
