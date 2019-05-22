/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.MainCourses;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface MainCourseRepo {
    public boolean add(MainCourses dto) throws Exception;
    public boolean merge(MainCourses dto) throws Exception;
    public boolean saveUpdate(MainCourses dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(MainCourses dto) throws Exception;
    public MainCourses search(int id) throws Exception;
    public List<MainCourses> getList() throws Exception; 
    public List<MainCourses> advancedSearch(String name) throws Exception; 
    public MainCourses searchForLogin(String email, String pass)throws Exception;
    public List<MainCourses> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
