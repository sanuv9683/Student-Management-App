/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Tracker;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface TrackerRepo {
    public boolean add(Tracker dto) throws Exception;
    public boolean merge(Tracker dto) throws Exception;
    public boolean saveUpdate(Tracker dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Tracker dto) throws Exception;
    public Tracker search(int id) throws Exception;
    public List<Tracker> getList() throws Exception; 
    public List<Tracker> advancedSearch(String name) throws Exception; 
    public Tracker searchForLogin(String email, String pass)throws Exception;
    public List<Tracker> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
