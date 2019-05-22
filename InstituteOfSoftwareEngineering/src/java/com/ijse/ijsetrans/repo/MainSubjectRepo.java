/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.MainSubjects;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface MainSubjectRepo {
    public boolean add(MainSubjects dto) throws Exception;
    public boolean merge(MainSubjects dto) throws Exception;
    public boolean saveUpdate(MainSubjects dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(MainSubjects dto) throws Exception;
    public MainSubjects search(int id) throws Exception;
    public List<MainSubjects> getList() throws Exception; 
    public List<MainSubjects> advancedSearch(String name) throws Exception; 
    public MainSubjects searchForLogin(String email, String pass)throws Exception;
    public List<MainSubjects> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
