/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.MainSemesters;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface MainSemestersRepo {
    public boolean add(MainSemesters dto) throws Exception;
    public boolean merge(MainSemesters dto) throws Exception;
    public boolean saveUpdate(MainSemesters dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(MainSemesters dto) throws Exception;
    public MainSemesters search(int id) throws Exception;
    public List<MainSemesters> getList() throws Exception; 
    public List<MainSemesters> advancedSearch(String name) throws Exception; 
    public MainSemesters searchForLogin(String email, String pass)throws Exception;
    public List<MainSemesters> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
