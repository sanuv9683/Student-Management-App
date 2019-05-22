/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.SchoolService;
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
public class SchoolController {
     @Autowired
    private SchoolService schoolService;

     @RequestMapping(value = "/addSchool", method = RequestMethod.POST)
    public void addSchool(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllSchool", method = RequestMethod.GET)
    public void getAllSchool(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoschool", method = RequestMethod.POST)
    public void searchSchool(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upschool", method = RequestMethod.POST)
    public void updateSchool(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delschool", method = RequestMethod.POST)
    public void deleteSchool(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "schooladvsearch", method = RequestMethod.POST)
    public void advanceSearchSchool(HttpServletRequest req, HttpServletResponse resp) {

    }
}
