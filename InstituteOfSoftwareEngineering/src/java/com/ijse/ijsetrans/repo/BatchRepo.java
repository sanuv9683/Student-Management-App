/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Batch;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface BatchRepo {
    public boolean add(Batch dto) throws Exception;
    public boolean merge(Batch dto) throws Exception;
    public boolean saveUpdate(Batch dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Batch dto) throws Exception;
    public Batch search(String id) throws Exception;
    public List<Batch> getList() throws Exception; 
    public List<Batch> advancedSearch(String name) throws Exception; 
    public Batch searchForLogin(String email, String pass)throws Exception;
    public List<Batch> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
