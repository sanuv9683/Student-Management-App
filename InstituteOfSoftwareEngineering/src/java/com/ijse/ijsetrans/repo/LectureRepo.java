/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.Lectures;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface LectureRepo {
    public boolean add(Lectures dto) throws Exception;
    public boolean merge(Lectures dto) throws Exception;
    public boolean saveUpdate(Lectures dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Lectures dto) throws Exception;
    public Lectures search(int id) throws Exception;
    public List<Lectures> getList() throws Exception; 
    public List<Lectures> advancedSearch(String name) throws Exception; 
    public Lectures searchForLogin(String email, String pass)throws Exception;
    public List<Lectures> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
