/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Gardian;
import com.ijse.ijsetrans.repo.GardianRepo;
import com.ijse.ijsetrans.service.GardianService;
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
public class GardianServiceImpl implements GardianService {

    @Autowired
    private GardianRepo GardianRepo;

    @Override
    public boolean addGardian(Gardian dto) throws Exception {
        return GardianRepo.add(dto);
    }

    @Override
    public boolean mergeGardian(Gardian dto) throws Exception {
        return GardianRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateGardian(Gardian dto) throws Exception {
        return GardianRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteGardian(int id) throws Exception {
        return GardianRepo.delete(id);
    }

    @Override
    public boolean updateGardian(Gardian dto) throws Exception {
        return GardianRepo.update(dto);
    }

    @Override
    public Gardian searchGardian(int id) throws Exception {
        return GardianRepo.search(id);
    }

    @Override
    public List<Gardian> getGardianList() throws Exception {
        return GardianRepo.getList();
    }

    @Override
    public List<Gardian> advancedGardianSearch(String name) throws Exception {
        return GardianRepo.advancedSearch(name);
    }

    @Override
    public Gardian searchGardianForLogin(String email, String pass) throws Exception {
        return GardianRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Gardian> getGardianListA(String query) throws Exception {
        return GardianRepo.getListA(query);
    }

    @Override
    public void flushGardian() throws Exception {
        GardianRepo.flush();
    }

}
