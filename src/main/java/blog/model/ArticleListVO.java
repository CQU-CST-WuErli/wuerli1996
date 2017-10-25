package blog.model;

import blog.entity.Blog;
import blog.entity.Link;

import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/10/22 at 23:38.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class ArticleListVO {
    private List<Blog> blogList;
    private List<String> tags;
    private List<String> categories;
    private List<Link> links;

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
