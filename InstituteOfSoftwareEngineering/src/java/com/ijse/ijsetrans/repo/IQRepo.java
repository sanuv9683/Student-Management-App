/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.IQTest;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface IQRepo {
    public boolean add(IQTest dto) throws Exception;
    public boolean merge(IQTest dto) throws Exception;
    public boolean saveUpdate(IQTest dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(IQTest dto) throws Exception;
    public IQTest search(int id) throws Exception;
    public List<IQTest> getList() throws Exception; 
    public List<IQTest> advancedSearch(String name) throws Exception; 
    public IQTest searchForLogin(String email, String pass)throws Exception;
    public List<IQTest> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
