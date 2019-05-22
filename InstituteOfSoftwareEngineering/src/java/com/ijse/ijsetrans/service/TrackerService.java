/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Tracker;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface TrackerService {
     public boolean addTracker(Tracker dto) throws Exception;
    public boolean mergeTracker(Tracker dto) throws Exception;
    public boolean saveUpdateTracker(Tracker dto)throws Exception;
    public boolean deleteTracker(int id) throws Exception;
    public boolean updateTracker(Tracker dto) throws Exception;
    public Tracker searchTracker(int id) throws Exception;
    public List<Tracker> getTrackerList() throws Exception; 
    public List<Tracker> advancedTrackerSearch(String name) throws Exception; 
    public Tracker searchTrackerForLogin(String email, String pass)throws Exception;
    public List<Tracker> getTrackerListA(String query) throws Exception; 
    public void flushTracker()throws Exception;
}
