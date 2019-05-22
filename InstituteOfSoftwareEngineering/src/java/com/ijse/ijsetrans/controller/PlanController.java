/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.PlanService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sanu Vithanage
 */
@Controller
public class PlanController {

    @Autowired
    private PlanService planService;

     @RequestMapping(value = "/addPlan", method = RequestMethod.POST)
    public void addPlan(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllPlan", method = RequestMethod.GET)
    public void getAllPlan(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoplan", method = RequestMethod.POST)
    public void searchPlan(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upplan", method = RequestMethod.POST)
    public void updatePlan(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delplan", method = RequestMethod.POST)
    public void deletePlan(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "planadvsearch", method = RequestMethod.POST)
    public void advanceSearchPlan(HttpServletRequest req, HttpServletResponse resp) {

    }

}
