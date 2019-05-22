/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Plan;
import com.ijse.ijsetrans.repo.PlanRepo;
import com.ijse.ijsetrans.service.PlanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu Vithanage
 */
@Service
@Transactional
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepo planRepo;

    @Override
    public boolean addPlan(Plan dto) throws Exception {
        return planRepo.add(dto);
    }

    @Override
    public boolean mergePlan(Plan dto) throws Exception {
        return planRepo.merge(dto);
    }

    @Override
    public boolean saveUpdatePlan(Plan dto) throws Exception {
        return planRepo.saveUpdate(dto);
    }

    @Override
    public boolean deletePlan(int id) throws Exception {
        return planRepo.delete(id);
    }

    @Override
    public boolean updatePlan(Plan dto) throws Exception {
        return planRepo.update(dto);
    }

    @Override
    public Plan searchPlan(int id) throws Exception {
        return planRepo.search(id);
    }

    @Override
    public List<Plan> getPlanList() throws Exception {
        return planRepo.getList();
    }

    @Override
    public List<Plan> advancedPlanSearch(String name) throws Exception {
        return planRepo.advancedSearch(name);
    }

    @Override
    public Plan searchPlanForLogin(String email, String pass) throws Exception {
        return planRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Plan> getPlanListA(String query) throws Exception {
        return planRepo.getListA(query);
    }

    @Override
    public void flushPlan() throws Exception {
        planRepo.flush();
    }

}
