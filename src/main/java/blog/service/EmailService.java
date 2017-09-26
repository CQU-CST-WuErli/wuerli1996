package blog.service;

import blog.pojo.json.Email;


/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 22:29.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public interface EmailService {
    void sendEmail(Email email) ;
}
