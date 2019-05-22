/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Clases;
import com.ijse.ijsetrans.repo.ClasesRepo;
import com.ijse.ijsetrans.service.ClasesService;
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
public class ClasesServiceImpl implements ClasesService {

    @Autowired
    private ClasesRepo adminRepo;

    @Override
    public boolean addClases(Clases dto) throws Exception {
        return adminRepo.add(dto);
    }

    @Override
    public boolean mergeClases(Clases dto) throws Exception {
        return adminRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateClases(Clases dto) throws Exception {
        return adminRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteClases(int id) throws Exception {
        return adminRepo.delete(id);
    }

    @Override
    public boolean updateClases(Clases dto) throws Exception {
        return adminRepo.update(dto);
    }

    @Override
    public Clases searchClases(int id) throws Exception {
        return adminRepo.search(id);
    }

    @Override
    public List<Clases> getClasesList() throws Exception {
        return adminRepo.getList();
    }

    @Override
    public List<Clases> advancedClasesSearch(String name) throws Exception {
        return adminRepo.advancedSearch(name);
    }

    @Override
    public Clases searchClasesForLogin(String email, String pass) throws Exception {
        return adminRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Clases> getClasesListA(String query) throws Exception {
        return adminRepo.getListA(query);
    }

    @Override
    public void flushClases() throws Exception {
        adminRepo.flush();
    }

}
