/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Course;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface CourseRepo {
    public boolean add(Course dto) throws Exception;
    public boolean merge(Course dto) throws Exception;
    public boolean saveUpdate(Course dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Course dto) throws Exception;
    public Course search(int id) throws Exception;
    public List<Course> getList() throws Exception; 
    public List<Course> advancedSearch(String name) throws Exception; 
    public Course searchForLogin(String email, String pass)throws Exception;
    public List<Course> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
