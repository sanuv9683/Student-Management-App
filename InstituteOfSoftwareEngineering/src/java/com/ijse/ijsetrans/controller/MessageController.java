/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Message;
import com.ijse.ijsetrans.core.TextMessage;
import com.ijse.ijsetrans.core.User;
import com.ijse.ijsetrans.dto.TempMessagesDTO;
import com.ijse.ijsetrans.service.MessageService;
import com.ijse.ijsetrans.service.TextMessageService;
import com.ijse.ijsetrans.service.UserService;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
 * @author Sanu
 */
@Controller
public class MessageController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageService messageService;

    @Autowired
    TextMessageService textService;

    @RequestMapping(value = "addMsg")
    public String addMessage(HttpServletRequest req, HttpServletResponse resp) {
        //get the sender
        User user = (User) req.getSession().getAttribute("cuser");

//        search the receiver
//        String id = Integer.parseInt(s)req.getParameter("id");
        return "aded";
    }

    @RequestMapping(value = "updateMsg")
    public String updateMessage(HttpServletRequest req, HttpServletResponse resp) {

        return "update";
    }

    @RequestMapping(value = "deleteMsg")
    public String deleteMessage(HttpServletRequest req, HttpServletResponse resp) {

        return "delete";
    }

    @RequestMapping(value = "searchMsg")
    public String searchMessage(HttpServletRequest req, HttpServletResponse resp) {

        return "search";
    }

    @RequestMapping(value = "getAllMsg")
    public void getallMessage(HttpServletRequest req, HttpServletResponse resp) {
        try {
            //get the sender
            ArrayList<TempMessagesDTO> allMessages = new ArrayList<TempMessagesDTO>();
            User user = (User) req.getSession().getAttribute("cuser");
            Set<Message> message = user.getMessages();
            if (!message.isEmpty()) {
                for (Message message1 : message) {
                    User searchUser = userService.searchUser(message1.getToUser());
                    User searchUser1 = userService.searchUser(message1.getFromUser());

                    TempMessagesDTO mes = new TempMessagesDTO();
                    mes.setDate(message1.getDate());
                    mes.setmSpecial(message1.getmIdentity());
                    mes.setMid(message1.getMid());//message id
                    mes.setLastMessage("Say Hai For For Your Friend..!");
                    if (user.getId() == message1.getToUser()) {
                        mes.setToUser(message1.getFromUser());
                        mes.setFromUser(message1.getToUser());
                        mes.setReceiversName(searchUser1.getFirstName() + " " + searchUser1.getLastName());
                    } else {
                        mes.setToUser(message1.getToUser());
                        mes.setFromUser(message1.getFromUser());
                        mes.setReceiversName(searchUser.getFirstName() + " " + searchUser.getLastName());
                    }

                    allMessages.add(mes);
                }
                String toJson = new Gson().toJson(allMessages);
                resp.getWriter().write(toJson);
            }

        } catch (IOException ex) {
            Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "searchUser")
    public void searchUser(HttpServletRequest req, HttpServletResponse resp) {
        try {
            // get the sender
            User sender = (User) req.getSession().getAttribute("cuser");

            resp.setContentType("appication/json");
            int sea = Integer.parseInt(req.getParameter("id"));

            User receiver = userService.searchUser(sea);
            User tempUsr = new User();
            tempUsr.setFirstName(receiver.getFirstName());
            tempUsr.setLastName(receiver.getLastName());
            tempUsr.setId(receiver.getId());

//            req.getServletContext().setAttribute("chat", receiver);
            String toJson = new Gson().toJson(tempUsr);
            resp.getWriter().write(toJson);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "sndmes", method = RequestMethod.POST)
    public void sendUserMessage(HttpServletRequest req, HttpServletResponse resp) {
        try {
            int receiversID = Integer.parseInt(req.getParameter("id"));
            String messageU = req.getParameter("userMesss");
            // get the sender
            Date d = new Date();
            SimpleDateFormat form = new SimpleDateFormat("hh:mm aaa");
            String format = form.format(d);
            //from
            User sender = (User) req.getSession().getAttribute("cuser");
            //to
            User receiver = userService.searchUser(receiversID);
            Set<Message> message = sender.getMessages();
            Set<Message> receMessages = receiver.getMessages();

            //all Message
            List<Message> allMessages = messageService.getMessageList();

            if (allMessages.isEmpty()) {
                Message newMessage = new Message();
                newMessage.setDate(format);
                newMessage.setFromUser(sender.getId());
                newMessage.setToUser(receiversID);
                String midenr = null;
                if (sender.getId() > receiversID) {
                    midenr = receiversID + ":" + sender.getId();
                } else {
                    midenr = sender.getId() + ":" + receiversID;
                }
                newMessage.setmIdentity(midenr);

                TextMessage newText = new TextMessage();
                newText.setDate_time(format);
                newText.setMessage(messageU);
                newText.setMainM(newMessage);
                newText.setOwner(sender.getId());
                //text aded to the message
                newMessage.getTextMessages().add(newText);
                //sned tge text for both users
                sender.getMessages().add(newMessage);
                receiver.getMessages().add(newMessage);
                messageService.addMessage(newMessage);
                userService.updateUser(receiver);
                userService.updateUser(sender);
            } else {
                String midenr = null;
                String mIdentity = null;
                boolean reso = false;
                Message selectedM = null;
                for (Message allMessage : allMessages) {
                    mIdentity = allMessage.getmIdentity();
                    if (sender.getId() > receiversID) {
                        midenr = receiversID + ":" + sender.getId();
                    } else {
                        midenr = sender.getId() + ":" + receiversID;
                    }
                    if (mIdentity.equals(midenr)) {
                        reso = true;
                        selectedM = allMessage;
                    }
                }
                if (reso) {
                    Set<TextMessage> textMessages = selectedM.getTextMessages();
                    TextMessage tempT = new TextMessage();
                    tempT.setDate_time(format);
                    tempT.setMessage(messageU);
                    tempT.setOwner(sender.getId());
                    tempT.setMainM(selectedM);
                    tempT.setOwner(sender.getId());
                    selectedM.getTextMessages().add(tempT);
                    textService.addTextMessage(tempT);
                    userService.updateUser(receiver);
                    userService.updateUser(sender);
                } else {
                    Message newMessage = new Message();
                    newMessage.setDate(format);
                    newMessage.setFromUser(sender.getId());
                    newMessage.setToUser(receiversID);
                    String miden = null;
                    if (sender.getId() > receiversID) {
                        miden = receiversID + ":" + sender.getId();
                    } else {
                        miden = sender.getId() + ":" + receiversID;
                    }
                    newMessage.setmIdentity(miden);

                    TextMessage newText = new TextMessage();
                    newText.setDate_time(format);
                    newText.setMessage(messageU);
                    newText.setMainM(newMessage);
                    newText.setOwner(sender.getId());
                    //text aded to the message
                    newMessage.getTextMessages().add(newText);
                    //sned tge text for both users
                    sender.getMessages().add(newMessage);
                    receiver.getMessages().add(newMessage);

                    messageService.addMessage(newMessage);
                    userService.updateUser(receiver);
                    userService.updateUser(sender);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "gelAllText")
    public void getAllText(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            int id = Integer.parseInt(req.getParameter("id"));
            ArrayList<TextMessage> tempMessages = new ArrayList<TextMessage>();
            User currentUser = (User) req.getSession().getAttribute("cuser");
            Set<Message> message = currentUser.getMessages();
            for (Message message1 : message) {
                if (message1.getMid() == id) {
                    Set<TextMessage> textMessages = message1.getTextMessages();
                    for (TextMessage textMessage : textMessages) {
                        TextMessage temp = new TextMessage();
                        temp.setDate_time(textMessage.getDate_time());
                        temp.setId(textMessage.getId());
                        temp.setMessage(textMessage.getMessage());
                        temp.setOwner(textMessage.getOwner());
                        tempMessages.add(temp);
                    }
                }
            }

            String toJson = new Gson().toJson(tempMessages);
            resp.getWriter().write(toJson);
        } catch (Exception ex) {
            Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @RequestMapping(value = "refresh")
    public void searchCompany(HttpServletRequest req, HttpServletResponse resp) {
        try {
            User user = (User) req.getSession().getAttribute("cuser");
            if (user != null) {
                int id = user.getId();
                User searchUser = userService.searchUser(id);
                req.getSession().setAttribute("cuser", searchUser);
            }

        } catch (Exception ex) {
            Logger.getLogger(MessageController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
