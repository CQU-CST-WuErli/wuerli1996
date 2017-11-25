package blog.pojo.component;

/**
 * Created by CQU-CST-WuErli on 2017/11/25 at 21:52.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class Category {
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
        return "Category{" +
                "value='" + value + '\'' +
                ", flag=" + flag +
                '}';
    }
}
