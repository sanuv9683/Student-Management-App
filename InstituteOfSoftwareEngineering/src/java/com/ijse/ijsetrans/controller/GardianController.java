/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.GardianService;
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
public class GardianController {

    @Autowired
    private GardianService gardianService;

    @RequestMapping(value = "/addGardian", method = RequestMethod.POST)
    public void addGardian(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllGardian", method = RequestMethod.GET)
    public void getAllGardian(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seogardian", method = RequestMethod.POST)
    public void searchGardian(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upgardian", method = RequestMethod.POST)
    public void updateGardian(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delgardian", method = RequestMethod.POST)
    public void deleteGardian(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "gardianadvsearch", method = RequestMethod.POST)
    public void advanceSearchGardian(HttpServletRequest req, HttpServletResponse resp) {

    }
}
