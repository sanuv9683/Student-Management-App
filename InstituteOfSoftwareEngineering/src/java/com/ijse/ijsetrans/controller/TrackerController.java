/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sanu Vithanage
 */
@Controller
public class TrackerController {
     @RequestMapping(value = "/addTracker", method = RequestMethod.POST)
    public void addTracker(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllTracker", method = RequestMethod.GET)
    public void getAllTracker(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seotracker", method = RequestMethod.POST)
    public void searchTracker(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "uptracker", method = RequestMethod.POST)
    public void updateTracker(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "deltracker", method = RequestMethod.POST)
    public void deleteTracker(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "trackeradvsearch", method = RequestMethod.POST)
    public void advanceSearchTracker(HttpServletRequest req, HttpServletResponse resp) {

    }
}
