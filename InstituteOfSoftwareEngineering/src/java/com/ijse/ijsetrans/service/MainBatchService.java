/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.MainBatch;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface MainBatchService {
    public boolean addMainBatch(MainBatch dto) throws Exception;
    public boolean mergeMainBatch(MainBatch dto) throws Exception;
    public boolean saveUpdateMainBatch(MainBatch dto)throws Exception;
    public boolean deleteMainBatch(int id) throws Exception;
    public boolean updateMainBatch(MainBatch dto) throws Exception;
    public MainBatch searchMainBatch(int id) throws Exception;
    public List<MainBatch> getMainBatchList() throws Exception; 
    public List<MainBatch> advancedMainBatchSearch(String name) throws Exception; 
    public MainBatch searchMainBatchForLogin(String email, String pass)throws Exception;
    public List<MainBatch> getMainBatchListA(String query) throws Exception; 
    public void flushMainBatch()throws Exception;
}
