package blog.pojo.component;

/**
 * Created by CQU-CST-WuErli on 2017/11/25 at 21:49.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class Tag {
    private String value;
    private boolean flag;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "value='" + value + '\'' +
                ", flag=" + flag +
                '}';
    }
}
