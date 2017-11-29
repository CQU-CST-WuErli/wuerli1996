package blog.controller.view;

import blog.model.AdminVO;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by CQU-CST-WuErli on 2017/11/17 at 20:38.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Controller
public class AdminController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/admin")
    public ModelAndView admin() {
        ModelAndView modelAndView = new ModelAndView();

        AdminVO object = blogService.getAdmin();

        modelAndView.addObject("object", object);
        modelAndView.setViewName("admin/admin");
        return modelAndView;
    }

}
