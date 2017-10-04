package blog.service.impl;

import blog.pojo.json.Email;
import blog.service.EmailService;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 22:29.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Service
public class EmailServiceImpl implements EmailService {
//mail.properties 文件
    @Value("${mail.hostname}")
    private String hostName;

    @Value("${mail.charset}")
    private String charset;

    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;

    @Value("${mail.to}")
    private String to;

    public void sendEmail(Email email) throws EmailException {
        HtmlEmail htmlEmail = new HtmlEmail();
        htmlEmail.setHostName(hostName);
        htmlEmail.setCharset(charset);
        htmlEmail.setAuthentication(username, password);
        htmlEmail.setSmtpPort(465);
        htmlEmail.setSSLOnConnect(true);

        String message = "";
        message += "Email from: " + email.getName() + "<br />";
        message += "Email address: " + email.getEmail() + "<br />";
        message += "Message: <br />";
        message += email.getMessage();
        message += "<br /> ----- <br /> This email was sent from your site's contact form. <br />";

        htmlEmail.setHtmlMsg(message);
        htmlEmail.setFrom(username);
        htmlEmail.setSubject(email.getSubject());
        htmlEmail.addTo(to);
        htmlEmail.send();

//        System.out.println("result=" + htmlEmail.send());
    }
}
