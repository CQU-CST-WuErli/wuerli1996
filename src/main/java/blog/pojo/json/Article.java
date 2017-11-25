package blog.pojo.json;

import blog.pojo.component.Category;
import blog.pojo.component.Tag;

import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/11/25 at 21:53.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class Article {
    private String title;
    private String content;
    private Category category;
    private List<Tag> tags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        String str = "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'';
        str += "category=" + category.toString();
        str += ", tags={";
        for (int i = 0; i < tags.size(); i++) {
            str += tags.get(i).toString() + ", ";
        }
        str += "}";
        return str;
    }
}
