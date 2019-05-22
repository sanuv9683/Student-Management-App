/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.LoggerrService;
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
public class LoggerController {

    @Autowired
    private LoggerrService loggerService;

    @RequestMapping(value = "/addLogger", method = RequestMethod.POST)
    public void addLogger(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllLogger", method = RequestMethod.GET)
    public void getAllLogger(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seologger", method = RequestMethod.POST)
    public void searchLogger(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "uplogger", method = RequestMethod.POST)
    public void updateLogger(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "dellogger", method = RequestMethod.POST)
    public void deleteLogger(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "loggeradvsearch", method = RequestMethod.POST)
    public void advanceSearchLogger(HttpServletRequest req, HttpServletResponse resp) {

    }
}
