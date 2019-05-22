/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Projects;
import com.ijse.ijsetrans.repo.ProjectsRepo;
import com.ijse.ijsetrans.service.ProjectService;
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
public class ProjectsServiceImpl implements ProjectService {

    @Autowired
    private ProjectsRepo proRepo;

    @Override
    public boolean addProjects(Projects dto) throws Exception {
        return proRepo.add(dto);
    }

    @Override
    public boolean mergeProjects(Projects dto) throws Exception {
        return proRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateProjects(Projects dto) throws Exception {
        return proRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteProjects(int id) throws Exception {
        return proRepo.delete(id);
    }

    @Override
    public boolean updateProjects(Projects dto) throws Exception {
        return proRepo.update(dto);
    }

    @Override
    public Projects searchProjects(int id) throws Exception {
        return proRepo.search(id);
    }

    @Override
    public List<Projects> getProjectsList() throws Exception {
        return proRepo.getList();
    }

    @Override
    public List<Projects> advancedProjectsSearch(String name) throws Exception {
        return proRepo.advancedSearch(name);
    }

    @Override
    public Projects searchProjectsForLogin(String email, String pass) throws Exception {
        return proRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Projects> getProjectsListA(String query) throws Exception {
        return proRepo.getListA(query);
    }

    @Override
    public void flushProjects() throws Exception {
        proRepo.flush();
    }

}
