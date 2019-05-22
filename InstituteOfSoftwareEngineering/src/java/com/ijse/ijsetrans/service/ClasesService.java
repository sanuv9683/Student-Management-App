/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Clases;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface ClasesService {
    public boolean addClases(Clases dto) throws Exception;
    public boolean mergeClases(Clases dto) throws Exception;
    public boolean saveUpdateClases(Clases dto)throws Exception;
    public boolean deleteClases(int id) throws Exception;
    public boolean updateClases(Clases dto) throws Exception;
    public Clases searchClases(int id) throws Exception;
    public List<Clases> getClasesList() throws Exception; 
    public List<Clases> advancedClasesSearch(String name) throws Exception; 
    public Clases searchClasesForLogin(String email, String pass)throws Exception;
    public List<Clases> getClasesListA(String query) throws Exception; 
    public void flushClases()throws Exception;
}
