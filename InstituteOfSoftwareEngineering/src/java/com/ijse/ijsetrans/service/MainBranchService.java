/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.MainBranch;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface MainBranchService {
    public boolean addMainBranch(MainBranch dto) throws Exception;
    public boolean mergeMainBranch(MainBranch dto) throws Exception;
    public boolean saveUpdateMainBranch(MainBranch dto)throws Exception;
    public boolean deleteMainBranch(int id) throws Exception;
    public boolean updateMainBranch(MainBranch dto) throws Exception;
    public MainBranch searchMainBranch(int id) throws Exception;
    public List<MainBranch> getMainBranchList() throws Exception; 
    public List<MainBranch> advancedMainBranchSearch(String name) throws Exception; 
    public MainBranch searchMainBranchForLogin(String email, String pass)throws Exception;
    public List<MainBranch> getMainBranchListA(String query) throws Exception; 
    public void flushMainBranch()throws Exception;
}
