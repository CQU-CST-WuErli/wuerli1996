package blog.pojo.tool;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;

import java.util.Arrays;
import java.util.List;

/**
 * Created by CQU-CST-WuErli on 2017/10/4 at 16:46.
 * Description :
 * Copyright (c) 2017 CQU_CST_WuErli. All rights reserved.
 */

public class StringConverter {

    public static String convert(String md) {
        MutableDataSet options = new MutableDataSet();
        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();
        Node document = parser.parse(md);
        String html = renderer.render(document);
        return html;
    }

    public static List<String> toList(String str) {
        return Arrays.asList(str.split("\\|"));
    }
}

