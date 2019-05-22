/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Tracker;
import com.ijse.ijsetrans.repo.TrackerRepo;
import com.ijse.ijsetrans.service.TrackerService;
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
public class TrackerServiceImpl implements TrackerService {

    @Autowired
    private TrackerRepo trackerRepo;

    @Override
    public boolean addTracker(Tracker dto) throws Exception {
        return trackerRepo.add(dto);
    }

    @Override
    public boolean mergeTracker(Tracker dto) throws Exception {
        return trackerRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateTracker(Tracker dto) throws Exception {
        return trackerRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteTracker(int id) throws Exception {
        return trackerRepo.delete(id);
    }

    @Override
    public boolean updateTracker(Tracker dto) throws Exception {
        return trackerRepo.update(dto);
    }

    @Override
    public Tracker searchTracker(int id) throws Exception {
        return trackerRepo.search(id);
    }

    @Override
    public List<Tracker> getTrackerList() throws Exception {
        return trackerRepo.getList();
    }

    @Override
    public List<Tracker> advancedTrackerSearch(String name) throws Exception {
        return trackerRepo.advancedSearch(name);
    }

    @Override
    public Tracker searchTrackerForLogin(String email, String pass) throws Exception {
        return trackerRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Tracker> getTrackerListA(String query) throws Exception {
        return trackerRepo.getListA(query);
    }

    @Override
    public void flushTracker() throws Exception {
        trackerRepo.flush();
    }

}
