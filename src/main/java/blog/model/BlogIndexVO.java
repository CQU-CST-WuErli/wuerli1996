package blog.model;

import blog.entity.Link;

import java.util.Date;
import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 18:03.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class BlogIndexVO {
    private String title;
    private String date;
    private List<String> tagList;
    private String content;
    private List<String> categories;
    private List<String> tags;
    private List<Link> linkList;

    public List<Link> getLinkList() {
        return linkList;
    }

    public void setLinkList(List<Link> linkList) {
        this.linkList = linkList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
