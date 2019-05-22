/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.other;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessagePreparator;

/**
 *
 * @author Sanu Vithanage
 */
public class SanuailSender {
    public static MimeMessagePreparator getMessagePreparator(String to, String sub, String mess) {
        String from="budgetlankaofficial@gmail.com";
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
                mimeMessage.setFrom(new InternetAddress(from));
                mimeMessage.setRecipient(Message.RecipientType.TO,
                        new InternetAddress(to));
                mimeMessage.setText(mess,"utf-8","html");
                mimeMessage.setSubject(sub);
            }
        };
        return preparator;
    }
}
