/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Batch;
import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.core.Semester;
import com.ijse.ijsetrans.dto.CourseDTO;
import com.ijse.ijsetrans.dto.SemesterDTO;
import com.ijse.ijsetrans.service.BatchService;
import com.ijse.ijsetrans.service.CourseService;
import com.ijse.ijsetrans.service.SemesterService;
import java.util.ArrayList;
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
public class SemesterController {
    
    @Autowired
    private SemesterService semesterService;
    
    @Autowired
    private BatchService batchService;
    
    @Autowired
    private CourseService courseService;
    
    @RequestMapping(value = "/addSemester", method = RequestMethod.POST)
    public void addSemester(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String batch = req.getParameter("batch");
        String course = req.getParameter("course");
        String semName = req.getParameter("sname");
        int semNumber = Integer.parseInt(req.getParameter("snumber"));
        
        Batch searchBatch = batchService.searchBatch(batch);
        if (searchBatch != null) {
            Set<Course> courses = searchBatch.getCourses();
            if (!courses.isEmpty()) {
                for (Course course1 : courses) {
                    if (course1.getCcode().equals(course)) {
                        Semester temp = new Semester();
                        temp.setSemName(semName);
                        temp.setSemesterNo(semNumber);
                        course1.getSemesters().add(temp);//need to analise this
                        break;
                    }
                }
                boolean updateBatch = batchService.updateBatch(searchBatch);
                resp.getWriter().print(updateBatch);
                
            } else {
                resp.getWriter().print("Error..!");
            }
            
        }
    }
    
    @RequestMapping(value = "/getAllSemester", method = RequestMethod.GET)
    public void getAllSemester(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        
    }
    
    @RequestMapping(value = "semgetcourses", method = RequestMethod.POST)
    public void searchSemester(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String batch = req.getParameter("batch");
            
            Batch searchBatch = batchService.searchBatch(batch);
            if (searchBatch != null) {
                Set<Course> courses = searchBatch.getCourses();
                ArrayList<CourseDTO> courseDTO = new ArrayList<>();
                for (Course course : courses) {
                    CourseDTO dto = new CourseDTO();
                    dto.setCcode(course.getCcode());
                    dto.setCourseFee(course.getCourseFee());
                    dto.setCourseName(course.getCourseName());
                    dto.setId(course.getId());
                    courseDTO.add(dto);
                }
                resp.setContentType("application/json");
                String toJson = new Gson().toJson(courseDTO);
                resp.getWriter().write(toJson);
            } else {
                resp.getWriter().print("Error Loding..!");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SemesterController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @RequestMapping(value = "semforbc", method = RequestMethod.GET)
    public void updateSemester(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            String batch = req.getParameter("batch");
            String course = req.getParameter("course");
            ArrayList<SemesterDTO> tempArray=new ArrayList<>();
            Batch searchBatch = batchService.searchBatch(batch);
            if (searchBatch != null) {
                Set<Course> courses = searchBatch.getCourses();
                if (!courses.isEmpty()) {
                    for (Course course1 : courses) {
                        if (course1.getCcode().equals(course)) {
                            Set<Semester> semesters = course1.getSemesters();
                            if (!semesters.isEmpty()) {
                                for (Semester semester : semesters) {
                                    SemesterDTO temp = new SemesterDTO();
                                    temp.setSemName(semester.getSemName());
                                    temp.setSemesterNo(semester.getSemesterNo());
                                    temp.setId(semester.getId());
                                    tempArray.add(temp);
                                }
                            }                           
                            break;
                        }
                    }
                    String toJson = new Gson().toJson(tempArray);
                    resp.getWriter().print(toJson);
                    
                } else {
                    resp.getWriter().print("Error..!");
                }                
            }
        } catch (Exception ex) {
            Logger.getLogger(SemesterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @RequestMapping(value = "delsemester", method = RequestMethod.POST)
    public void deleteSemester(HttpServletRequest req, HttpServletResponse resp) {
        
    }
    
    @RequestMapping(value = "semesteradvsearch", method = RequestMethod.POST)
    public void advanceSearchSemester(HttpServletRequest req, HttpServletResponse resp) {
        
    }
}
