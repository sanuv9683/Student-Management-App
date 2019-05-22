/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sanu Vithanage
 */
@Controller
public class CommonController {

    @RequestMapping(value = "/batch")
    public String f1() {
        return "batch";
    }

    @RequestMapping(value = "/course")
    public String f2() {
        return "course";
    }

    @RequestMapping(value = "/forgot")
    public String f3() {
        return "forgot";
    }

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String f4() {
        return "login";
    }

    @RequestMapping(value = "/payment")
    public String payment() {
        return "payment";
    }

    @RequestMapping(value = "/registration")
    public String f5() {
        return "registration";
    }

    @RequestMapping(value = "/semester")
    public String semester() {
        return "semester";
    }

    @RequestMapping(value = "/subject")
    public String subject() {
        return "subject";
    }

    @RequestMapping(value = "/buttons")
    public String buttons() {
        return "buttons";
    }

    @RequestMapping(value = "/continue")
    public String continuereg() {
        return "continue-reg";
    }

    @RequestMapping(value = "/settings")
    public String settings() {
        return "settings";
    }

    @RequestMapping(value = "/branch")
    public String branch() {
        return "branch";
    }

     @RequestMapping(value = "/cosebatch")
    public String cosebath() {
        return "cosebath";
    }
}
