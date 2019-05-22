/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.core.Subject;
import com.ijse.ijsetrans.service.SubjectService;
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
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/addSubject", method = RequestMethod.POST)
    public void addSubject(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//        String type = req.getParameter("type");
//        if (type.equals("Full")) {
//               Subject tempSubject = new Subject();
//            tempSubject.setCredit(0);
//            tempSubject.setResult(result);
//            tempSubject.setSub_name(sub_name);
//            
//            subjectService.addSubject(tempSubject);
//
//        } else if (type.equals("Half")) {
//            Subject tempSubject = new Subject();
//            tempSubject.setCredit(0);
//            tempSubject.setResult(result);
//            tempSubject.setSub_name(sub_name);
//            
//            subjectService.addSubject(tempSubject);
//        }

    }

    @RequestMapping(value = "/getAllSubject", method = RequestMethod.GET)
    public void getAllSubject(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seosubject", method = RequestMethod.POST)
    public void searchSubject(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upsubject", method = RequestMethod.POST)
    public void updateSubject(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delsubject", method = RequestMethod.POST)
    public void deleteSubject(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "subjectadvsearch", method = RequestMethod.POST)
    public void advanceSearchSubject(HttpServletRequest req, HttpServletResponse resp) {

    }
}
