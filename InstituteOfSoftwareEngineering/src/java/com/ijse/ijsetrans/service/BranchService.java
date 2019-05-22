/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Branch;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface BranchService {
     public boolean addBranch(Branch dto) throws Exception;
    public boolean mergeBranch(Branch dto) throws Exception;
    public boolean saveUpdateBranch(Branch dto)throws Exception;
    public boolean deleteBranch(int id) throws Exception;
    public boolean updateBranch(Branch dto) throws Exception;
    public Branch searchBranch(int id) throws Exception;
    public List<Branch> getBranchList() throws Exception; 
    public List<Branch> advancedBranchSearch(String name) throws Exception; 
    public Branch searchBranchForLogin(String email, String pass)throws Exception;
    public List<Branch> getBranchListA(String query) throws Exception; 
    public void flushBranch()throws Exception;
}
