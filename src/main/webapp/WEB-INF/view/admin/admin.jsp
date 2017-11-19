<%--
  Created by CQU-CST-WuErli
  Date: 2017/11/17
  Time: 20:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/favicon-1.ico">
    <title>Concole</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <link href="plugins/editor/css/editormd.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Console</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <%--侧边栏--%>
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li id="overview" class="nav-button active"><a href="javascript:void(0);">Overview <span class="sr-only">(current)</span></a></li>
                <li id="write-article" class="nav-button"><a href="javascript:void(0);">Write Article</a></li>
            </ul>
        </div>

        <div id="overview-page" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Overview</h1>
            <p>
                The console to the website.
            </p>
        </div>
        <div id="write-article-page" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" style="display: none">
            <h1 class="page-header"><input placeholder="Title" style="border: none; width: 100%"></h1>
            <div id="editor">
                <textarea style="display:none;" id="content"></textarea>
            </div>
            <input type="button" id="test-button" value="test">
        </div>
    </div>
</div>

<script src="js/jquery-2.1.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="plugins/editor/editormd.min.js"></script>
<script src="plugins/editor/languages/en.js"></script>
<script>
    (function ($) {
        var $current = $(".nav-button.active");
        $(".nav-button").click(function () {
            var $this = $(this);
            if ($this.hasClass("active")) return;
            $current.removeClass("active");
            $this.attr("class", "active");
            $("#" + $current.attr("id") + "-page").css("display", "none");
            $("#" + $this.attr("id") + "-page").css("display", "");
            $current = $this;
        });
        $("#test-button").click(function () {
            console.log($("#content").val());
        });
    })(jQuery);
    var testEditor;
    $(function() {
        testEditor = editormd("editor", {
            width   : "100%",
            height  : 640,
            syncScrolling : "single",
            path    : "plugins/editor/lib/",
            saveHTMLToTextarea   : false
        });
    });
</script>
</body>
</html>
