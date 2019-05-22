/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Batch;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface BatchService {
    public boolean addBatch(Batch dto) throws Exception;
    public boolean mergeBatch(Batch dto) throws Exception;
    public boolean saveUpdateBatch(Batch dto)throws Exception;
    public boolean deleteBatch(int id) throws Exception;
    public boolean updateBatch(Batch dto) throws Exception;
    public Batch searchBatch(String id) throws Exception;
    public List<Batch> getBatchList() throws Exception; 
    public List<Batch> advancedBatchSearch(String name) throws Exception; 
    public Batch searchBatchForLogin(String email, String pass)throws Exception;
    public List<Batch> getBatchListA(String query) throws Exception; 
    public void flushBatch()throws Exception;
}
