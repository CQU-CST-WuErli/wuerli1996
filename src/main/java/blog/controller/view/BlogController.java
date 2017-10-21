package blog.controller.view;

import blog.dao.BlogDao;
import blog.entity.Blog;
import blog.model.BlogIndexViewObject;
import blog.service.BlogService;
import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
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
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/text")
    public String test() {
        return "test";
    }

    @RequestMapping("/blog")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        BlogIndexViewObject object = blogService.getIndex();

        modelAndView.addObject("object", object);
        modelAndView.setViewName("blog/index");
        return modelAndView;
    }

    @RequestMapping("/blog/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("blog/list");
        return modelAndView;
    }

}
