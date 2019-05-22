/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Branch;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface BranchRepo {
    public boolean add(Branch dto) throws Exception;
    public boolean merge(Branch dto) throws Exception;
    public boolean saveUpdate(Branch dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Branch dto) throws Exception;
    public Branch search(int id) throws Exception;
    public List<Branch> getList() throws Exception; 
    public List<Branch> advancedSearch(String name) throws Exception; 
    public Branch searchForLogin(String email, String pass)throws Exception;
    public List<Branch> getListA(String query) throws Exception; 
    public void flush()throws Exception;  
}
