/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.Clases;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface ClasesRepo {
    public boolean add(Clases dto) throws Exception;
    public boolean merge(Clases dto) throws Exception;
    public boolean saveUpdate(Clases dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Clases dto) throws Exception;
    public Clases search(int id) throws Exception;
    public List<Clases> getList() throws Exception; 
    public List<Clases> advancedSearch(String name) throws Exception; 
    public Clases searchForLogin(String email, String pass)throws Exception;
    public List<Clases> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
