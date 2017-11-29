package blog.model;

import blog.entity.Category;
import blog.entity.Tag;

import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/11/26 at 21:15.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class AdminVO {
    private List<String> categories;

    private List<String> tags;

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
