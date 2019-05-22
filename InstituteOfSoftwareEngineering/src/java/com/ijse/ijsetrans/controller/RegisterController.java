/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.RegisterService;
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
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/addRegister", method = RequestMethod.POST)
    public void addRegister(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String studentID = req.getParameter("stuID");
        String branch = req.getParameter("branch");
        String batch = req.getParameter("batch");
    }

    @RequestMapping(value = "/getAllRegister", method = RequestMethod.GET)
    public void getAllRegister(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoregister", method = RequestMethod.POST)
    public void searchRegister(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upregister", method = RequestMethod.POST)
    public void updateRegister(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delregister", method = RequestMethod.POST)
    public void deleteRegister(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "registeradvsearch", method = RequestMethod.POST)
    public void advanceSearchRegister(HttpServletRequest req, HttpServletResponse resp) {

    }
}
