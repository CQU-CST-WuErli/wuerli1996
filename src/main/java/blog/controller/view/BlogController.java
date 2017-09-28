package blog.controller.view;

import blog.dao.BlogDao;
import blog.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 17:21.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogDao blogDao;

    @RequestMapping("/text")
    public String test() {
        Blog blog = new Blog();
        blog.setTitle("test");
        blog.setContent("test");
        blog.setDate(new Date());
        blog.setCatagory("test");
        blog.setTags("test");
        blogDao.add(blog);
        return "test";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("blog/index");
        return modelAndView;
    }


}
