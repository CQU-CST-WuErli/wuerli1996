package blog.pojo.tool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 20:04.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class TimeTool {
    public static String toTimestamp(Date date){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}
