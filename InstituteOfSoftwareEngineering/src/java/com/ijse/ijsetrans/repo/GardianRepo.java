/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Gardian;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface GardianRepo {
    public boolean add(Gardian dto) throws Exception;
    public boolean merge(Gardian dto) throws Exception;
    public boolean saveUpdate(Gardian dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Gardian dto) throws Exception;
    public Gardian search(int id) throws Exception;
    public List<Gardian> getList() throws Exception; 
    public List<Gardian> advancedSearch(String name) throws Exception; 
    public Gardian searchForLogin(String email, String pass)throws Exception;
    public List<Gardian> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
