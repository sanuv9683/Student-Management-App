/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Batch;
import com.ijse.ijsetrans.core.Course;
import com.ijse.ijsetrans.core.MainCourses;
import com.ijse.ijsetrans.dto.CourseDTO;
import com.ijse.ijsetrans.service.BatchService;
import com.ijse.ijsetrans.service.CourseService;
import com.ijse.ijsetrans.service.MainCoursesService;
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
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private MainCoursesService mainCourseService;

    @Autowired
    private BatchService batchService;

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    public void addCourse(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        String courseName = req.getParameter("courseName");
        double courseFee = Double.parseDouble(req.getParameter("courseFee"));
        String courseCode = req.getParameter("courseCode");
        MainCourses temp = new MainCourses();
        temp.setCcode(courseCode);
        temp.setCourseFee(courseFee);
        temp.setCourseName(courseName);

        boolean addCourse = mainCourseService.addMainCourses(temp);
        resp.getWriter().print(addCourse);

    }

    @RequestMapping(value = "/getAllCourse", method = RequestMethod.GET)
    public void getAllCourse(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        resp.setContentType("application/json");
        List<Course> courseList = courseService.getCourseList();
        ArrayList<CourseDTO> newCoursesList = new ArrayList<>();
        if (!courseList.isEmpty()) {
            for (Course course : courseList) {
                CourseDTO temp = new CourseDTO();
                temp.setCcode(course.getCcode());
                temp.setCourseFee(course.getCourseFee());
                temp.setCourseName(course.getCourseName());
                newCoursesList.add(temp);
            }

            String toJson = new Gson().toJson(newCoursesList);
            resp.getWriter().write(toJson);
        }

    }

    @RequestMapping(value = "bcmerge", method = RequestMethod.POST)
    public void searchCourse(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String batch = req.getParameter("batch");
            String course = req.getParameter("course");

            Batch searchBatch = batchService.searchBatch(batch);
            if (searchBatch != null) {
                Set<Course> courses = searchBatch.getCourses();
                if (!courses.isEmpty()) {
                    String sql = "from MainCourses c where c.ccode='" + course + "'";
                    List<MainCourses> courseListA = mainCourseService.getMainCoursesList();
                    MainCourses tempC = null;
                    if (!courseListA.isEmpty()) {
                        for (MainCourses course1 : courseListA) {
                            tempC = course1;
                        }
                        Course newC = new Course();
                        newC.setCourseName(tempC.getCourseName());
                        newC.setCcode(tempC.getCcode());
                        newC.setCourseFee(tempC.getCourseFee());

                        if (!courses.contains(tempC.getCourseName())) {
                            searchBatch.getCourses().add(newC);
                            boolean updateBatch = batchService.updateBatch(searchBatch);
                            resp.getWriter().print(updateBatch);
                        }
                    } else {
                        resp.getWriter().print("Error ..! System error.");
                    }

                } else {
                    String sql = "from Course c where c.ccode='" + course + "'";
                    List<Course> courseListA = courseService.getCourseListA(sql);
                    Course tempC = null;
                    if (!courseListA.isEmpty()) {
                        for (Course course1 : courseListA) {
                            tempC = course1;
                        }
                        searchBatch.getCourses().add(tempC);
                        boolean updateBatch = batchService.updateBatch(searchBatch);
                        resp.getWriter().print(updateBatch);

                    } else {
                        resp.getWriter().print("Error ..! System error.");
                    }
                }
            } else {
                resp.getWriter().print("Error ..! Course Selection error.");
            }

        } catch (Exception ex) {
            Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "upcourse", method = RequestMethod.POST)
    public void updateCourse(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String batchName = req.getParameter("batchID");
            Batch searchBatch = batchService.searchBatch(batchName);
            if (searchBatch != null) {
                String sql = "from Course c where c.ccode='" + searchBatch + "'";
                List<Course> courseListA = courseService.getCourseListA(sql);
                if (!courseListA.isEmpty()) {
                    for (Course course : courseListA) {
                        searchBatch.getCourses().add(course);
                    }

                    boolean updateBatch = batchService.updateBatch(searchBatch);
                    resp.getWriter().print(updateBatch);

                } else {
                    resp.getWriter().print("Error..! There is a problem with Course Selection.. !");
                }
            } else {
                resp.getWriter().print("Error..! There is a problem with Batch Selection.. !");
            }

        } catch (Exception ex) {
            Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "delcourse", method = RequestMethod.POST)
    public void deleteCourse(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "getAllCourses", method = RequestMethod.POST)
    public void advanceSearchCourse(HttpServletRequest req, HttpServletResponse resp) {

    }
}
