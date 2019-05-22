/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo;

import com.ijse.ijsetrans.core.Projects;
import java.util.List;

/**
 *
 * @author Sanu Vithanage
 */
public interface ProjectsRepo {
  public boolean add(Projects dto) throws Exception;
    public boolean merge(Projects dto) throws Exception;
    public boolean saveUpdate(Projects dto)throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(Projects dto) throws Exception;
    public Projects search(int id) throws Exception;
    public List<Projects> getList() throws Exception; 
    public List<Projects> advancedSearch(String name) throws Exception; 
    public Projects searchForLogin(String email, String pass)throws Exception;
    public List<Projects> getListA(String query) throws Exception; 
    public void flush()throws Exception;    
}
