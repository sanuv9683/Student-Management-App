/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.repo.CourseRepo;
import com.ijse.ijsetrans.service.CourseService;
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
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public boolean addCourse(Course dto) throws Exception {
        return courseRepo.add(dto);
    }

    @Override
    public boolean mergeCourse(Course dto) throws Exception {
        return courseRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateCourse(Course dto) throws Exception {
        return courseRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteCourse(int id) throws Exception {
        return courseRepo.delete(id);
    }

    @Override
    public boolean updateCourse(Course dto) throws Exception {
        return courseRepo.update(dto);
    }

    @Override
    public Course searchCourse(int id) throws Exception {
        return courseRepo.search(id);
    }

    @Override
    public List<Course> getCourseList() throws Exception {
        return courseRepo.getList();
    }

    @Override
    public List<Course> advancedCourseSearch(String name) throws Exception {
        return courseRepo.advancedSearch(name);
    }

    @Override
    public Course searchCourseForLogin(String email, String pass) throws Exception {
        return courseRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Course> getCourseListA(String query) throws Exception {
        return courseRepo.getListA(query);
    }

    @Override
    public void flushCourse() throws Exception {
        courseRepo.flush();
    }

}
