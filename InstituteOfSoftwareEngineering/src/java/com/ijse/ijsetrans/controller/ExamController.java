/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.ExamService;
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
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/addExam", method = RequestMethod.POST)
    public void addExam(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllExam", method = RequestMethod.GET)
    public void getAllExam(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seoexam", method = RequestMethod.POST)
    public void searchExam(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upexam", method = RequestMethod.POST)
    public void updateExam(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delexam", method = RequestMethod.POST)
    public void deleteExam(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "examadvsearch", method = RequestMethod.POST)
    public void advanceSearchExam(HttpServletRequest req, HttpServletResponse resp) {

    }
}
