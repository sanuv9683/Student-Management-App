/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.IQService;
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
public class IQController {

    @Autowired
    private IQService iqService;

     @RequestMapping(value = "/addIQTest", method = RequestMethod.POST)
    public void addIQTest(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllIQTest", method = RequestMethod.GET)
    public void getAllIQTest(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoiqtest", method = RequestMethod.POST)
    public void searchIQTest(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upiqtest", method = RequestMethod.POST)
    public void updateIQTest(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "deliqtest", method = RequestMethod.POST)
    public void deleteIQTest(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "iqtestadvsearch", method = RequestMethod.POST)
    public void advanceSearchIQTest(HttpServletRequest req, HttpServletResponse resp) {

    }
}
