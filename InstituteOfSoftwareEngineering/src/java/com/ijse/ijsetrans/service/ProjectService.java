/*
 * To change this license header, choose License Headers in Projects Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Projects;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface ProjectService {
     public boolean addProjects(Projects dto) throws Exception;
    public boolean mergeProjects(Projects dto) throws Exception;
    public boolean saveUpdateProjects(Projects dto)throws Exception;
    public boolean deleteProjects(int id) throws Exception;
    public boolean updateProjects(Projects dto) throws Exception;
    public Projects searchProjects(int id) throws Exception;
    public List<Projects> getProjectsList() throws Exception; 
    public List<Projects> advancedProjectsSearch(String name) throws Exception; 
    public Projects searchProjectsForLogin(String email, String pass)throws Exception;
    public List<Projects> getProjectsListA(String query) throws Exception; 
    public void flushProjects()throws Exception;
}
