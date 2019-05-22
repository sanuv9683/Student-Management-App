/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Loggerr;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface LoggerrService {
    public boolean addLoggerr(Loggerr dto) throws Exception;
    public boolean mergeLoggerr(Loggerr dto) throws Exception;
    public boolean saveUpdateLoggerr(Loggerr dto)throws Exception;
    public boolean deleteLoggerr(int id) throws Exception;
    public boolean updateLoggerr(Loggerr dto) throws Exception;
    public Loggerr searchLoggerr(int id) throws Exception;
    public List<Loggerr> getLoggerrList() throws Exception; 
    public List<Loggerr> advancedLoggerrSearch(String name) throws Exception; 
    public Loggerr searchLoggerrForLogin(String email, String pass)throws Exception;
    public List<Loggerr> getLoggerrListA(String query) throws Exception; 
    public void flushLoggerr()throws Exception; 
}
