/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Batch;
import com.ijse.ijsetrans.core.Branch;
import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.dto.BatchDTO;
import com.ijse.ijsetrans.dto.CourseDTO;
import com.ijse.ijsetrans.service.BatchService;
import com.ijse.ijsetrans.service.BranchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class BatchController {

    @Autowired
    private BatchService batchService;

    @Autowired
    private BranchService branchService;

    @RequestMapping(value = "addBatch", method = RequestMethod.POST)
    public void addBatch(HttpServletRequest req, HttpServletResponse resp) {
        String batchID = req.getParameter("batchid");
        String batchNumber = req.getParameter("batchnumber");
        String date = req.getParameter("sdate");
        String branch = req.getParameter("branch");
        String batchType = req.getParameter("batchType");
        try {
            List<Batch> batchList = batchService.getBatchList();
            if (!batchList.isEmpty()) {
                List<Batch> advancedBatchSearch = batchService.advancedBatchSearch(batchID);
                if (advancedBatchSearch.isEmpty()) {
                    Batch batch = new Batch();
                    batch.setBatchID(batchID);
                    batch.setBatchNo(batchNumber);
                    batch.setStartDate(date);
                    batch.setGpa(0);
                    batch.setTotal(0);
                    batch.setBatchType(batchType);
                    List<Branch> advancedBranchSearch = branchService.getBranchListA("from Branch b where b.branchName='" + branch + "'");
                    if (!advancedBranchSearch.isEmpty()) {
                        for (Branch branch1 : advancedBranchSearch) {
                            batch.setBranchi(branch1);
                        }
                        boolean addBatch = batchService.addBatch(batch);
                        resp.getWriter().print(addBatch);
                    } else {
                        resp.getWriter().write("Please Add A Branch Before Add Batch..!");
                    }
                } else {
                    resp.getWriter().write("Error You have alredy added " + batchID);
                }
            } else {
                Batch batch = new Batch();
                batch.setBatchID(batchID);
                batch.setBatchNo(batchNumber);
                batch.setStartDate(date);
                batch.setGpa(0);
                batch.setTotal(0);
                batch.setBatchType(batchType);
                List<Branch> advancedBranchSearch = branchService.getBranchListA("from Branch b where b.branchName='" + branch + "'");
                if (!advancedBranchSearch.isEmpty()) {
                    for (Branch branch1 : advancedBranchSearch) {
                        batch.setBranchi(branch1);
                    }
                    boolean addBatch = batchService.addBatch(batch);
                    if (addBatch) {
                        resp.getWriter().print("Successfully Aded..!");
                    } else {
                        resp.getWriter().print("Aded Failed..!");
                    }

                } else {
                    resp.getWriter().write("Please Add A Branch Before Add Batch..!");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(BatchController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "getAllBatches")
    public void getAllBatchs(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            ArrayList<BatchDTO> newBatches = new ArrayList<>();
            List<Batch> batchList = batchService.getBatchList();
            if (!batchList.isEmpty()) {
                for (Batch batch : batchList) {
                    BatchDTO temp = new BatchDTO();
                    temp.setBatchID(batch.getBatchID());
                    temp.setBatchNo(batch.getBatchNo());
                    temp.setGpa(batch.getGpa());
                    temp.setStartDate(batch.getStartDate());
                    temp.setTotal(batch.getTotal());
                    temp.setBatchType(batch.getBatchType());
                    newBatches.add(temp);
                }
            }

            String toJson = new Gson().toJson(newBatches);
            resp.getWriter().write(toJson);

        } catch (Exception ex) {
            Logger.getLogger(BatchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "getAFCbatch")
    public void searchBatch(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            ArrayList<BatchDTO> newBatches = new ArrayList<>();
            List<Batch> batchList = batchService.getBatchList();
            if (!batchList.isEmpty()) {
                for (Batch batch : batchList) {
                    if (batch.getBatchType().equals("Full Time Course")) {
                        BatchDTO temp = new BatchDTO();
                        temp.setBatchID(batch.getBatchID());
                        temp.setBatchNo(batch.getBatchNo());
                        temp.setGpa(batch.getGpa());
                        temp.setStartDate(batch.getStartDate());
                        temp.setTotal(batch.getTotal());
                        temp.setBatchType(batch.getBatchType());
                        newBatches.add(temp);
                    }

                }
            }

            String toJson = new Gson().toJson(newBatches);
            resp.getWriter().write(toJson);

        } catch (Exception ex) {
            Logger.getLogger(BatchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "getACFB", method = RequestMethod.GET)
    public void updateBatch(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String batch = req.getParameter("batch");
            Batch searchBatch = batchService.searchBatch(batch);
            if (searchBatch != null) {
                Set<Course> courses = searchBatch.getCourses();
                ArrayList<CourseDTO> coursesDTO = new ArrayList<>();
                if (!courses.isEmpty()) {
                    for (Course course : courses) {
                        CourseDTO temp = new CourseDTO();
                        temp.setCcode(course.getCcode());
                        temp.setCourseFee(course.getCourseFee());
                        temp.setCourseName(course.getCourseName());
                        temp.setId(course.getId());
                        coursesDTO.add(temp);
                    }

                }
                resp.setContentType("application/json");
                String toJson = new Gson().toJson(coursesDTO);
                resp.getWriter().write(toJson);
            }

        } catch (Exception ex) {
            Logger.getLogger(BatchController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "delbatch", method = RequestMethod.POST)
    public void deleteBatch(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "batchadvsearch", method = RequestMethod.POST)
    public void advanceSearchBatch(HttpServletRequest req, HttpServletResponse resp) {

    }

}
