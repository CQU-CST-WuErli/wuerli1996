package blog.service;

import blog.model.ArticleListVO;
import blog.model.BlogIndexVO;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 17:58.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public interface BlogService {
    BlogIndexVO getIndex();

    ArticleListVO getArticleList();
}
