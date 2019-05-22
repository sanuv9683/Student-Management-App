/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.UniversityService;
import com.ijse.ijsetrans.service.UserService;
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
public class UniversityController {
     @Autowired
    private UniversityService universityService;

     @RequestMapping(value = "/addUniversity", method = RequestMethod.POST)
    public void addUniversity(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllUniversity", method = RequestMethod.GET)
    public void getAllUniversity(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seouniversity", method = RequestMethod.POST)
    public void searchUniversity(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upuniversity", method = RequestMethod.POST)
    public void updateUniversity(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "deluniversity", method = RequestMethod.POST)
    public void deleteUniversity(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "universityadvsearch", method = RequestMethod.POST)
    public void advanceSearchUniversity(HttpServletRequest req, HttpServletResponse resp) {

    }
}
