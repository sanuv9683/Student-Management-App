/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.ProjectService;
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
public class ProjectController {
     @Autowired
    private ProjectService projectService;

     @RequestMapping(value = "/addProject", method = RequestMethod.POST)
    public void addProject(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllProject", method = RequestMethod.GET)
    public void getAllProject(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoproject", method = RequestMethod.POST)
    public void searchProject(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upproject", method = RequestMethod.POST)
    public void updateProject(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delproject", method = RequestMethod.POST)
    public void deleteProject(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "projectadvsearch", method = RequestMethod.POST)
    public void advanceSearchProject(HttpServletRequest req, HttpServletResponse resp) {

    }
}
