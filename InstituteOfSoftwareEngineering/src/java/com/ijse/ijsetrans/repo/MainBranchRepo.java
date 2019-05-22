/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;


import com.ijse.ijsetrans.core.MainBranch;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface MainBranchRepo {
    public boolean add(MainBranch dto) throws Exception;
    public boolean merge(MainBranch dto) throws Exception;
    public boolean saveUpdate(MainBranch dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(MainBranch dto) throws Exception;
    public MainBranch search(int id) throws Exception;
    public List<MainBranch> getList() throws Exception; 
    public List<MainBranch> advancedSearch(String name) throws Exception; 
    public MainBranch searchForLogin(String email, String pass)throws Exception;
    public List<MainBranch> getListA(String query) throws Exception; 
    public void flush()throws Exception;
}
