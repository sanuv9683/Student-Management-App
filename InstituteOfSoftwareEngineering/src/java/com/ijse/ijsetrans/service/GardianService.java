/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Gardian;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface GardianService {
     public boolean addGardian(Gardian dto) throws Exception;
    public boolean mergeGardian(Gardian dto) throws Exception;
    public boolean saveUpdateGardian(Gardian dto)throws Exception;
    public boolean deleteGardian(int id) throws Exception;
    public boolean updateGardian(Gardian dto) throws Exception;
    public Gardian searchGardian(int id) throws Exception;
    public List<Gardian> getGardianList() throws Exception; 
    public List<Gardian> advancedGardianSearch(String name) throws Exception; 
    public Gardian searchGardianForLogin(String email, String pass)throws Exception;
    public List<Gardian> getGardianListA(String query) throws Exception; 
    public void flushGardian()throws Exception;
}
