/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.MainBatch;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface MainBatchRepo {
    public boolean add(MainBatch dto) throws Exception;
    public boolean merge(MainBatch dto) throws Exception;
    public boolean saveUpdate(MainBatch dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(MainBatch dto) throws Exception;
    public MainBatch search(int id) throws Exception;
    public List<MainBatch> getList() throws Exception; 
    public List<MainBatch> advancedSearch(String name) throws Exception; 
    public MainBatch searchForLogin(String email, String pass)throws Exception;
    public List<MainBatch> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
