/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.service.PaymentService;
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
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    public void addPayment(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "/getAllPayment", method = RequestMethod.GET)
    public void getAllPayment(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seopayment", method = RequestMethod.POST)
    public void searchPayment(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "uppayment", method = RequestMethod.POST)
    public void updatePayment(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delpayment", method = RequestMethod.POST)
    public void deletePayment(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "paymentadvsearch", method = RequestMethod.POST)
    public void advanceSearchPayment(HttpServletRequest req, HttpServletResponse resp) {

    }
}
