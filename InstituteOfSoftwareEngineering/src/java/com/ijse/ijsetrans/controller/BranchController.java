/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Branch;
import com.ijse.ijsetrans.dto.BranchDTO;
import com.ijse.ijsetrans.service.BranchService;
import java.util.ArrayList;
import java.util.List;
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
public class BranchController {

    @Autowired
    private BranchService brachService;

    @RequestMapping(value = "/addBranch", method = RequestMethod.POST)
    public void addBrnanch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String bName = req.getParameter("bname");
        String bLoca = req.getParameter("bloca");
        String bAddOne = req.getParameter("baddone");
        String bAddTwo = req.getParameter("baddtwo");
        String bAddThree = req.getParameter("baddthree");
        String bConta = req.getParameter("bcontact");

        List<Branch> branchList = brachService.getBranchList();
        if (!branchList.isEmpty()) {
            List<Branch> advancedBranchSearch = brachService.advancedBranchSearch(bName);
            if (advancedBranchSearch.isEmpty()) {
                Branch b = new Branch();
                b.setBranchName(bName);
                b.setAddress1(bAddOne);
                b.setAddress2(bAddTwo);
                b.setAddress3(bAddThree);
                b.setBranchLocation(bLoca);
                b.setContactNum(bConta);

                boolean addBranch = brachService.addBranch(b);
                resp.getWriter().print(addBranch);
            }
        } else {
            Branch b = new Branch();
            b.setBranchName(bName);
            b.setAddress1(bAddOne);
            b.setAddress2(bAddTwo);
            b.setAddress3(bAddThree);
            b.setBranchLocation(bLoca);
            b.setContactNum(bConta);

            boolean addBranch = brachService.addBranch(b);
            resp.getWriter().print(addBranch);
        }

    }

    @RequestMapping(value = "/getAllBranch", method = RequestMethod.GET)
    public void getAllBrnanch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        resp.setContentType("application-json");
        List<Branch> branchList = brachService.getBranchList();
        ArrayList<BranchDTO> branchDto = new ArrayList<>();
        for (Branch branch : branchList) {
            BranchDTO b = new BranchDTO();
            b.setBranchName(branch.getBranchName());
            b.setAddress1(branch.getAddress1());
            b.setAddress2(branch.getAddress2());
            b.setAddress3(branch.getAddress3());
            b.setBranchLocation(branch.getBranchLocation());
            b.setContactNum(branch.getContactNum());
            branchDto.add(b);
        }

        String toJson = new Gson().toJson(branchDto);
        resp.getWriter().write(toJson);

    }

    @RequestMapping(value = "seobranch", method = RequestMethod.POST)
    public void searchBranch(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "upbranch", method = RequestMethod.POST)
    public void updateBranch(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delbranch", method = RequestMethod.POST)
    public void deleteBranch(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "branchadvsearch", method = RequestMethod.POST)
    public void advanceSearchBranch(HttpServletRequest req, HttpServletResponse resp) {

    }
}
