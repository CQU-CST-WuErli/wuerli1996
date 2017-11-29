package blog.service.impl;

import blog.dao.BlogDao;
import blog.dao.CategoryDao;
import blog.dao.LinkDao;
import blog.dao.TagDao;
import blog.entity.Blog;
import blog.entity.Category;
import blog.entity.Tag;
import blog.model.AdminVO;
import blog.model.ArticleListVO;
import blog.model.BlogIndexVO;
import blog.pojo.json.Article;
import blog.pojo.tool.StringConverter;
import blog.pojo.tool.TimeTool;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 17:58.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogDao blogDao;

    private final CategoryDao categoryDao;

    private final TagDao tagDao;

    private final LinkDao linkDao;

    @Autowired
    public BlogServiceImpl(BlogDao blogDao, CategoryDao categoryDao, TagDao tagDao, LinkDao linkDao) {
        this.blogDao = blogDao;
        this.categoryDao = categoryDao;
        this.tagDao = tagDao;
        this.linkDao = linkDao;
    }

    public BlogIndexVO getIndex() {
        BlogIndexVO object = new BlogIndexVO();

        Blog latestBlog = blogDao.getLatestBlog();
        object.setTitle(latestBlog.getTitle());
        object.setDate(TimeTool.toTimestamp(latestBlog.getDate()));
        object.setTagList(StringConverter.toList(latestBlog.getTags()));
        object.setContent(StringConverter.convert(latestBlog.getContent()));

        object.setCategories(categoryDao.getAll());

        object.setTags(tagDao.getAll());

        object.setLinkList(linkDao.getAllLinks());

        return object;
    }

    public ArticleListVO getArticleList() {
        ArticleListVO object = new ArticleListVO();

        List<Blog> blogList = blogDao.getAllSimpleInfo();

        for (Blog blog: blogList) {
            blog.setTagList(StringConverter.toList(blog.getTags()));
            blog.setStdDate(TimeTool.toTimestamp(blog.getDate()));
        }
        object.setBlogList(blogList);
        object.setCategories(categoryDao.getAll());

        object.setTags(tagDao.getAll());

        object.setLinks(linkDao.getAllLinks());

        return object;
    }

    public BlogIndexVO getDetail(int id) {
        BlogIndexVO object = new BlogIndexVO();

        Blog blog = blogDao.selectById(id);
        object.setId(blog.getId());
        object.setTitle(blog.getTitle());
        object.setDate(TimeTool.toTimestamp(blog.getDate()));
        object.setTagList(StringConverter.toList(blog.getTags()));
        object.setContent(StringConverter.convert(blog.getContent()));

        object.setCategories(categoryDao.getAll());

        object.setTags(tagDao.getAll());

        object.setLinkList(linkDao.getAllLinks());
        return object;
    }

    public ArticleListVO getArticleByKey(String keyword) {
        ArticleListVO object = new ArticleListVO();

        List<Blog> blogList = blogDao.getByKey(keyword);

        if (blogList == null) {
            blogList = new ArrayList<Blog>();
        }


        if (blogList.size() > 0) {
            for (Blog blog: blogList) {
                blog.setTagList(StringConverter.toList(blog.getTags()));
                blog.setStdDate(TimeTool.toTimestamp(blog.getDate()));
            }
        }
        object.setBlogList(blogList);
        object.setCategories(categoryDao.getAll());

        object.setTags(tagDao.getAll());

        object.setLinks(linkDao.getAllLinks());

        return object;
    }

    public AdminVO getAdmin() {
        AdminVO object = new AdminVO();
        object.setCategories(categoryDao.getAll());
        object.setTags(tagDao.getAll());
        return object;
    }

    public void addArticle(Article article) {
        Blog blog = new Blog();
        blog.setTitle(article.getTitle());
        blog.setContent(article.getContent());
        blog.setDate(new Date());
        blog.setCategory(article.getCategory().getValue());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < article.getTags().size(); i++) {
            if (i > 0) str.append("|");
            str.append(article.getTags().get(i).getValue());
        }
        blog.setTags(str.toString());
        blogDao.add(blog);
        if (article.getCategory().isFlag()) {
            Category category = new Category();
            category.setCategory(article.getCategory().getValue());
            categoryDao.add(category);
        }
        for (int i = 0; i < article.getTags().size(); i++) {
            if (article.getTags().get(i).isFlag()) {
                Tag tag = new Tag();
                tag.setTag(article.getTags().get(i).getValue());
                tagDao.add(tag);
            }
        }
    }

}
