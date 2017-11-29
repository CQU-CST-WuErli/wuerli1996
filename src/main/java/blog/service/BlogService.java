package blog.service;

import blog.model.AdminVO;
import blog.model.ArticleListVO;
import blog.model.BlogIndexVO;
import blog.pojo.json.Article;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 17:58.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public interface BlogService {
    BlogIndexVO getIndex();

    ArticleListVO getArticleList();

    BlogIndexVO getDetail(int id);

    ArticleListVO getArticleByKey(String keyword);

    AdminVO getAdmin();

    void addArticle(Article article);
}
