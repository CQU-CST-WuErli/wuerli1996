package blog.dao;

import blog.entity.Link;

import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/10/22 at 1:09.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public interface LinkDao {
    List<Link> getAllLinks();
}
