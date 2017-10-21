package blog.entity;

/**
 * Created by CQU-CST-WuErli on 2017/10/22 at 1:07.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class Link {
    private int id;
    private String title;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
