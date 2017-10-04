package blog.service.impl;

import blog.dao.BlogDao;
import blog.dao.CategoryDao;
import blog.dao.TagDao;
import blog.entity.Blog;
import blog.model.BlogIndexViewObject;
import blog.pojo.tool.StringConverter;
import blog.pojo.tool.TimeTool;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 17:58.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private TagDao tagDao;

    public BlogIndexViewObject getIndex() {
        BlogIndexViewObject object = new BlogIndexViewObject();

        Blog latestBlog = blogDao.getLatestBlog();
        object.setTitle(latestBlog.getTitle());
        object.setDate(TimeTool.toTimestamp(latestBlog.getDate()));
        object.setTagList(StringConverter.toList(latestBlog.getTags()));
        object.setContent(StringConverter.convert(latestBlog.getContent()));

        System.out.println(latestBlog.getContent().length());

        object.setCategories(categoryDao.getAll());

        object.setTags(tagDao.getAll());

        return object;
    }
}
