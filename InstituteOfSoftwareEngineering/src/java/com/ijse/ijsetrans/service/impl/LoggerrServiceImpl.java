/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Loggerr;
import com.ijse.ijsetrans.repo.LoggerrRepo;
import com.ijse.ijsetrans.service.LoggerrService;
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
public class LoggerrServiceImpl implements LoggerrService {

    @Autowired
    private LoggerrRepo loggerRepo;

    @Override
    public boolean addLoggerr(Loggerr dto) throws Exception {
        return loggerRepo.add(dto);
    }

    @Override
    public boolean mergeLoggerr(Loggerr dto) throws Exception {
        return loggerRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateLoggerr(Loggerr dto) throws Exception {
        return loggerRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteLoggerr(int id) throws Exception {
        return loggerRepo.delete(id);
    }

    @Override
    public boolean updateLoggerr(Loggerr dto) throws Exception {
        return loggerRepo.update(dto);
    }

    @Override
    public Loggerr searchLoggerr(int id) throws Exception {
        return loggerRepo.search(id);
    }

    @Override
    public List<Loggerr> getLoggerrList() throws Exception {
        return loggerRepo.getList();
    }

    @Override
    public List<Loggerr> advancedLoggerrSearch(String name) throws Exception {
        return loggerRepo.advancedSearch(name);
    }

    @Override
    public Loggerr searchLoggerrForLogin(String email, String pass) throws Exception {
        return loggerRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Loggerr> getLoggerrListA(String query) throws Exception {
        return loggerRepo.getListA(query);
    }

    @Override
    public void flushLoggerr() throws Exception {
        loggerRepo.flush();
    }

}
