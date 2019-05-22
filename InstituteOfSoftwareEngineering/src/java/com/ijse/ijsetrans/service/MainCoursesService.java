/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.MainCourses;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface MainCoursesService {
    public boolean addMainCourses(MainCourses dto) throws Exception;
    public boolean mergeMainCourses(MainCourses dto) throws Exception;
    public boolean saveUpdateMainCourses(MainCourses dto)throws Exception;
    public boolean deleteMainCourses(int id) throws Exception;
    public boolean updateMainCourses(MainCourses dto) throws Exception;
    public MainCourses searchMainCourses(int id) throws Exception;
    public List<MainCourses> getMainCoursesList() throws Exception; 
    public List<MainCourses> advancedMainCoursesSearch(String name) throws Exception; 
    public MainCourses searchMainCoursesForLogin(String email, String pass)throws Exception;
    public List<MainCourses> getMainCoursesListA(String query) throws Exception; 
    public void flushMainCourses()throws Exception;
}
