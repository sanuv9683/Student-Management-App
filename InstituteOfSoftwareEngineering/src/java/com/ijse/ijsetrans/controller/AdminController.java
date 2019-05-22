/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.ijse.ijsetrans.core.Admin;
import com.ijse.ijsetrans.other.PassManager;
import com.ijse.ijsetrans.service.AdminService;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Sanu Vithanage
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminServe;

    @RequestMapping(value = "/sanusanu")
    public String registerAdmin(HttpServletRequest req, HttpServletResponse resp) {
        String password = "admin";
        try {
            List<Admin> adminList = adminServe.getAdminList();
            if (adminList.isEmpty()) {
                Admin newAdmin = new Admin();
                newAdmin.setFirstName("Niroth");
                newAdmin.setLastName("Samarawickrama");
                newAdmin.setEmail("sanuv9683@gmail.com");
                newAdmin.setPpic("user.png");
                String encripted = PassManager.encriptMyPass(password);
                newAdmin.setPass(encripted);
                boolean addAdmin = adminServe.addAdmin(newAdmin);
                if (addAdmin) {
                    return "index";
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "index";
    }

    @RequestMapping(value = "/updateAdminPic", method = RequestMethod.POST)
    public void searchUserFromID(@RequestParam(value = "cvupload") MultipartFile cvupload, HttpServletRequest req, HttpServletResponse resp) {
        Admin admin = (Admin) req.getSession().getAttribute("cuAdmin");
        if (admin != null) {
            try {
                String realPath = req.getServletContext().getRealPath("/resources/images");
                String originalFilename = cvupload.getOriginalFilename();
                String rrPath = realPath + File.separator + originalFilename;
                File out = new File(rrPath);
                out.createNewFile();
                FileOutputStream outS = new FileOutputStream(out);
                InputStream inputStream = cvupload.getInputStream();
                int read = 0;
                byte[] buffer = new byte[1024];
                while ((read = inputStream.read(buffer, 0, buffer.length)) != -1) {
                    outS.write(buffer, 0, buffer.length);
                }
                admin.setPpic(originalFilename);

                File inputFile = new File(rrPath);
                BufferedImage inputImage = ImageIO.read(inputFile);

                // creates output image
                BufferedImage outputImage = new BufferedImage(200,
                        200, inputImage.getType());

                // scales the input image to the output image
                Graphics2D g2d = outputImage.createGraphics();
                g2d.drawImage(inputImage, 0, 0, 200, 200, null);
                g2d.dispose();

                // extracts extension of output file
                String formatName = rrPath.substring(rrPath
                        .lastIndexOf(".") + 1);

                // writes to output file
                ImageIO.write(outputImage, formatName, new File(rrPath));
                boolean updateAdmin = adminServe.updateAdmin(admin);
                if (updateAdmin) {
                    resp.getWriter().write("ok");
                }
            } catch (IOException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @RequestMapping(value = "/tes1")
    public void updateAdmin(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "/test2")
    public void deleteAdmin(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "/test3")
    public void searchAdminsFromID(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "/test4")
    public void searchAdminsFromQuery(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "/test5")
    public void viewAllAdmins(HttpServletRequest req, HttpServletResponse resp) {

    }

    @RequestMapping(value = "/test6")
    public void viewAdminsLike(HttpServletRequest req, HttpServletResponse resp) {

    }
}
