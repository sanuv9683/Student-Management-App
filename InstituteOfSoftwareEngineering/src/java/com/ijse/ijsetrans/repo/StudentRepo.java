/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Student;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface StudentRepo {
    public boolean add(Student dto) throws Exception;
    public boolean merge(Student dto) throws Exception;
    public boolean saveUpdate(Student dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Student dto) throws Exception;
    public Student search(int id) throws Exception;
    public List<Student> getList() throws Exception; 
    public List<Student> advancedSearch(String name) throws Exception; 
    public Student searchForLogin(String email, String pass)throws Exception;
    public List<Student> getListA(String query) throws Exception; 
    public void flush()throws Exception;   
}
