/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.core.Gardian;
import com.ijse.ijsetrans.core.IQTest;
import com.ijse.ijsetrans.core.School;
import com.ijse.ijsetrans.core.Student;
import com.ijse.ijsetrans.core.University;
import com.ijse.ijsetrans.service.StudentService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudent(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String initName = req.getParameter("initName");
            String firstName = req.getParameter("fName");
            String lastName = req.getParameter("lName");
            String address1 = req.getParameter("aOne");
            String address2 = req.getParameter("aTwo");
            String address3 = req.getParameter("aThree");
            String hometp = req.getParameter("homeTp");
            String mobile = req.getParameter("mobileTp");
            String dob = req.getParameter("bob");
            String email = req.getParameter("email");
            String gender = req.getParameter("gender");
            String nic = req.getParameter("nic");
            String requee = req.getParameter("regfee");

//            gardian
            String gfirstName = req.getParameter("GfName");
            String glastName = req.getParameter("GlName");
            String gaddress1 = req.getParameter("GaOne");
            String gaddress2 = req.getParameter("GaTwo");
            String gaddress3 = req.getParameter("GaThree");
            String ghometp = req.getParameter("GhomeTp");
            String gmobile = req.getParameter("GmobileTp");

//            edu
            String schoolName = req.getParameter("schoolName");
            String schoolLocation = req.getParameter("schoolLocation");
            String uniName = req.getParameter("uName");
            String uniYear = req.getParameter("uYear");

            String iqq = req.getParameter("iq");

            List<Student> studentList = studentService.advancedStudentSearch(nic);
            if (studentList.isEmpty()) {
                Student tempStu = new Student();
                tempStu.setAddress1(address1);
                tempStu.setAddress2(address2);
                tempStu.setAddress3(address3);

                SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");//EEEEE dd MMMMM yyyy
                Date dobb = dt.parse(dob);
                Date date = new Date();

                tempStu.setAddress1(address1);
                tempStu.setAddress2(address2);
                tempStu.setAddress3(address3);
                tempStu.setDateofBirth(dobb);
                tempStu.setEmail(email);
                if ("Male".equals(gender)) {
                    tempStu.setGender("Male");
                } else {
                    tempStu.setGender("Female");
                }

                tempStu.setInitName(initName);
                tempStu.setJoinDate(date);
                tempStu.setLastName(lastName);
                tempStu.setNic(nic);
                tempStu.setTel_home(hometp);
                tempStu.setTel_mob(mobile);
                tempStu.setfName(firstName);
                tempStu.setRegFree(Integer.parseInt(requee));

                Gardian g = new Gardian();
                g.setAddress1(gaddress1);
                g.setAddress2(gaddress2);
                g.setAddress3(gaddress3);
                g.setFirstName(gfirstName);
                g.setLastName(glastName);
                g.setPic("user.png");
                g.setpNumber(ghometp);
                g.settNumber(gmobile);
                g.getStudents().add(tempStu);

                if (schoolName != "") {
                    School newS = new School();
                    newS.setLocation(schoolLocation);
                    newS.setSchoolName(schoolName);
                    tempStu.getSchools().add(newS);
                }

                if (uniName != "") {
                    University tem = new University();
                    tem.setUni_name(uniName);
                    tem.setYear(uniYear);
                    tempStu.setUniversity(tem);
                }

                tempStu.getGardians().add(g);

                IQTest iq = new IQTest();
                iq.setDate(date);
                iq.setResult(0);
                iq.setStatus(iqq);
                iq.setStudent(tempStu);

                tempStu.setIqTest(iq);

                boolean addStudent = studentService.addStudent(tempStu);
                resp.getWriter().print(addStudent);
            } else {
                resp.getWriter().print("Error");

            }

        } catch (ParseException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
    public void getAllStudent(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seostudent", method = RequestMethod.POST)
    public void searchStudent(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upstudent", method = RequestMethod.POST)
    public void updateStudent(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "delstudent", method = RequestMethod.POST)
    public void deleteStudent(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "studentadvsearch", method = RequestMethod.POST)
    public void advanceSearchStudent(HttpServletRequest req, HttpServletResponse resp) {

    }
}
