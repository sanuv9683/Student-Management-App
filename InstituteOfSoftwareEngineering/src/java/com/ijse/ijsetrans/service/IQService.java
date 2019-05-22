/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.IQTest;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface IQService {
     public boolean addIQTest(IQTest dto) throws Exception;
    public boolean mergeIQTest(IQTest dto) throws Exception;
    public boolean saveUpdateIQTest(IQTest dto)throws Exception;
    public boolean deleteIQTest(int id) throws Exception;
    public boolean updateIQTest(IQTest dto) throws Exception;
    public IQTest searchIQTest(int id) throws Exception;
    public List<IQTest> getIQTestList() throws Exception; 
    public List<IQTest> advancedIQTestSearch(String name) throws Exception; 
    public IQTest searchIQTestForLogin(String email, String pass)throws Exception;
    public List<IQTest> getIQTestListA(String query) throws Exception; 
    public void flushIQTest()throws Exception;
}
