/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Plan;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface PlanRepo {
   public boolean add(Plan dto) throws Exception;
    public boolean merge(Plan dto) throws Exception;
    public boolean saveUpdate(Plan dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Plan dto) throws Exception;
    public Plan search(int id) throws Exception;
    public List<Plan> getList() throws Exception; 
    public List<Plan> advancedSearch(String name) throws Exception; 
    public Plan searchForLogin(String email, String pass)throws Exception;
    public List<Plan> getListA(String query) throws Exception; 
    public void flush()throws Exception;   
}
