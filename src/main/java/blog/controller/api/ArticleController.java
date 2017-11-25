package blog.controller.api;

import blog.pojo.json.Article;
import blog.pojo.json.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CQU-CST-WuErli on 2017/11/25 at 22:08.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */
@Controller
@RequestMapping("/api")
public class ArticleController {

    @RequestMapping("/addBlog")
    @ResponseBody
    public Result addBlog(@RequestBody Article article) {
        Result result = new Result();

        System.out.println(article.toString());

        result.setStatus(0);
        result.setInfo("succ");
        return result;
    }
}
