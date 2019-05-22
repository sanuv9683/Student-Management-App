/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.core.Country;
import com.ijse.ijsetrans.core.Loggerr;
import com.ijse.ijsetrans.core.Message;
import com.ijse.ijsetrans.core.Notification;
import com.ijse.ijsetrans.core.User;
import com.ijse.ijsetrans.other.PassManager;
import com.ijse.ijsetrans.service.CountryService;
import com.ijse.ijsetrans.service.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CountryService cuCountryService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        String email = req.getParameter("email");
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");

        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        Message temp = new Message();

        user.getMessages().add(temp);

        Loggerr tempL = new Loggerr();

        user.getLogger().add(tempL);

        String sql = "from Country p where p.countryname='Sri Lanka'";
        List<Country> allCountryList = cuCountryService.getListForQuery(sql);
        if (!allCountryList.isEmpty()) {
            Country ctry = null;
            for (Country country : allCountryList) {
                ctry = country;
            }

            user.setMyContry(ctry);
        }

        Notification tempN = new Notification();
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYY-mm-DD");
        String format1 = format.format(d);
        tempN.setNotMessage("You Were Registerd As A User on " + format1);
        tempN.setDate(d);
        user.getNotyDes().add(tempN);

        String encriptMyPass = PassManager.encriptMyPass("ijseuser");
        user.setPass(encriptMyPass);
        user.setPpic("user.png");
        user.setState("enable");
        boolean addUser = userService.addUser(user);
        resp.getWriter().print(addUser);

    }

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public void getAllUser(HttpServletRequest req, HttpServletResponse resp) throws Exception {

    }

    @RequestMapping(value = "seouser", method = RequestMethod.POST)
    public void searchUser(HttpServletRequest req, HttpServletResponse resp) {
    }

    @RequestMapping(value = "upuser", method = RequestMethod.POST)
    public void updateUser(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "deluser", method = RequestMethod.POST)
    public void deleteUser(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "useradvsearch", method = RequestMethod.POST)
    public void advanceSearchUser(HttpServletRequest req, HttpServletResponse resp) {

    }

}
