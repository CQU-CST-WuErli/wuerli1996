package blog.dao;

import blog.entity.Blog;

/**
 * Created by CQU-CST-WuErli on 2017/9/28 at 15:41.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public interface BlogDao {
    int add(Blog blog);

    Blog selectById(int id);

    Blog getLatestBlog();
}
