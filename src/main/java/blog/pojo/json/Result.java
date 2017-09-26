package blog.pojo.json;

/**
 * Created by CQU-CST-WuErli on 2017/9/26 at 20:49.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

/**
 * api return result
 * status: 0 = success; 1 = fail;
 * info: details and extra info
 */

public class Result {

    private int status;
    private String info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
