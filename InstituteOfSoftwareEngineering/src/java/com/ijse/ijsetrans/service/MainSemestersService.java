/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.MainSemesters;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface MainSemestersService {
    public boolean addMainSemesters(MainSemesters dto) throws Exception;
    public boolean mergeMainSemesters(MainSemesters dto) throws Exception;
    public boolean saveUpdateMainSemesters(MainSemesters dto)throws Exception;
    public boolean deleteMainSemesters(int id) throws Exception;
    public boolean updateMainSemesters(MainSemesters dto) throws Exception;
    public MainSemesters searchMainSemesters(int id) throws Exception;
    public List<MainSemesters> getMainSemestersList() throws Exception; 
    public List<MainSemesters> advancedMainSemestersSearch(String name) throws Exception; 
    public MainSemesters searchMainSemestersForLogin(String email, String pass)throws Exception;
    public List<MainSemesters> getMainSemestersListA(String query) throws Exception; 
    public void flushMainSemesters()throws Exception;
}
