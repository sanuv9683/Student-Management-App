/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Course;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface CourseService {
    public boolean addCourse(Course dto) throws Exception;
    public boolean mergeCourse(Course dto) throws Exception;
    public boolean saveUpdateCourse(Course dto)throws Exception;
    public boolean deleteCourse(int id) throws Exception;
    public boolean updateCourse(Course dto) throws Exception;
    public Course searchCourse(int id) throws Exception;
    public List<Course> getCourseList() throws Exception; 
    public List<Course> advancedCourseSearch(String name) throws Exception; 
    public Course searchCourseForLogin(String email, String pass)throws Exception;
    public List<Course> getCourseListA(String query) throws Exception; 
    public void flushCourse()throws Exception; 
}
