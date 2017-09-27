package blog.controller.api;

import blog.pojo.json.Email;
import blog.pojo.json.Result;
import blog.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 16:54.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Controller
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/sendEmail")
    @ResponseBody
    public Result sendEmail(@RequestBody Email email) {
        Result result = new Result();

        result.setStatus(1);

        if (email.getName().length() == 0 || email.getName() == null) {
            result.setInfo("Name is empty!");
        } else if (email.getEmail().length() == 0 || email.getEmail() == null) {
            result.setInfo("Email Address is empty!");
        } else if (email.getSubject().length() == 0 || email.getSubject() == null) {
            result.setInfo("Subject is empty!");
        } else if (email.getMessage().length() == 0 || email.getMessage() == null) {
            result.setInfo("Message is empty!");
        } else {
            Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}");
            Matcher m = p.matcher(email.getEmail());
            if (!m.matches()) {
                result.setInfo("Email Address is not vaild!");
            } else {
                result.setStatus(0);
                result.setInfo(email.toString());
            }
        }
        System.out.println(email.toString());
        System.out.println(result.toString());

        return result;
    }
}
