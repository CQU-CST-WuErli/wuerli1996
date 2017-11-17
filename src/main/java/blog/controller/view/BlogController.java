package blog.controller.view;

import blog.model.ArticleListVO;
import blog.model.BlogIndexVO;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 17:21.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Controller
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping("/text")
    public String test() {
        return "test";
    }

    @RequestMapping("/blog")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        BlogIndexVO object = blogService.getIndex();

        modelAndView.addObject("object", object);
        modelAndView.setViewName("blog/index");
        return modelAndView;
    }

    @RequestMapping("/blog/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();

        ArticleListVO object = blogService.getArticleList();

        modelAndView.addObject("object", object);
        modelAndView.setViewName("blog/list");
        return modelAndView;
    }

    @RequestMapping("/blog/detail/{id}")
    public ModelAndView detail(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();

        BlogIndexVO object = blogService.getDetail(id);

        modelAndView.addObject("object", object);
        modelAndView.setViewName("blog/detail");
        return modelAndView;
    }

    @RequestMapping("/blog/search")
    public ModelAndView search(String keyword) {
        ModelAndView modelAndView = new ModelAndView();

        ArticleListVO object = blogService.getArticleByKey(keyword);
        modelAndView.addObject("object", object);
        modelAndView.setViewName("blog/search");
        return modelAndView;
    }

}
