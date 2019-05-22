/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Plan;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface PlanService {
     public boolean addPlan(Plan dto) throws Exception;
    public boolean mergePlan(Plan dto) throws Exception;
    public boolean saveUpdatePlan(Plan dto)throws Exception;
    public boolean deletePlan(int id) throws Exception;
    public boolean updatePlan(Plan dto) throws Exception;
    public Plan searchPlan(int id) throws Exception;
    public List<Plan> getPlanList() throws Exception; 
    public List<Plan> advancedPlanSearch(String name) throws Exception; 
    public Plan searchPlanForLogin(String email, String pass)throws Exception;
    public List<Plan> getPlanListA(String query) throws Exception; 
    public void flushPlan()throws Exception;
}
