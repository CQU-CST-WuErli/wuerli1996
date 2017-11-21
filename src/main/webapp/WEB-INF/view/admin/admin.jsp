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
    <link href="plugins/toastr/toastr.css" rel="stylesheet">
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
            <h1 class="page-header"><input placeholder="Title" style="border: none; width: 100%; outline: none;" id="title"></h1>
            <div id="editor">
                <textarea style="display:none;" id="content"></textarea>
            </div>
            <input type="button" id="deploy-button" class="btn btn-primary btn-lg" value="Deploy" style="width: 15%; float: right;" data-toggle="modal" data-target="#modal">
        </div>
    </div>
</div>
<div class="modal fade" id="modal" tabindex="-1">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Categories and tags</h4>
            </div>
            <div class="modal-body">
                <div class="dropdown">
                    <button style="width: 30%;" class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Choose category
                        <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                        <li><a href="javascript:void(0);" class="dropdownMenu1Item">Action</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu1Item">Another action</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu1Item">Something else here</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu1Item">Separated link</a></li>
                    </ul>
                    <button class="btn btn-primary" type="button" id="newcategory-btn">New category</button>
                    <div class="input-group" style="width: 51%;">
                        <input class="form-control" type="text" style="display: none;" id="inputcategory">
                        <span class="input-group-btn">
                            <button class="btn btn-primary" type="button" style="display: none;" id="addcategory-btn">Add</button>
                        </span>
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button" style="display: none;" id="cancelcategory-btn">Cancel</button>
                        </span>
                    </div>
                </div>
                <br>
                <div class="dropdown">
                    <button style="width: 30%;" class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Choose tags<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                        <li><a href="javascript:void(0);" class="dropdownMenu2Item">Action</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu2Item">Another action</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu2Item">Something else here</a></li>
                        <li><a href="javascript:void(0);" class="dropdownMenu2Item">Separated link</a></li>
                    </ul>
                    <button class="btn btn-primary" type="button" id="add-exit-tag-btn">Add</button>
                </div>
                <br>
                <div class="input-group" style="width: 39%;">
                    <input type="text" class="form-control" placeholder="New tag" id="input-tag">
                    <span class="input-group-btn">
                        <button class="btn btn-primary" type="button" id="add-tag-btn">Add</button>
                    </span>
                </div>
                <div>
                    <div>
                        <h3>Category:  <span id="comfirm-category"></span></h3>
                    </div>
                    <div>
                        <h3>Tags:
                            <span class="label label-default" id="head" style="display: none;">CDQ<a class="delete-tag" href="javascript:void(0);" style="color: black; text-decoration: none;">&times;</a></span>
                        </h3>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary" id="submit-button">Submit</button>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery-2.1.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="plugins/editor/editormd.min.js"></script>
<script src="plugins/editor/languages/en.js"></script>
<script src="plugins/toastr/toastr.min.js"></script>
<script>
    (function ($) {
        // section switch
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

        // editor
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

        toastr.options = {
            closeButton: true,
            debug: false,
            progressBar: false,
            positionClass: "toast-top-full-width",
            onclick: null,
            showDuration: "200",
            hideDuration: "2000",
            timeOut: "5000",
            extendedTimeOut: "1000",
            showEasing: "swing",
            hideEasing: "linear",
            showMethod: "fadeIn",
            hideMethod: "fadeOut"
        };
//        {
//            "title": "test",
//            "category": {
//            "value": "test",
//                "new": "0"
//        },
//            "tags": [
//            {
//                "value": "test",
//                "new": "0"
//            },
//            {
//                "value": "test",
//                "new": "1"
//            }
//        ]
//        }

        var title;
        var content;
        var category;
        var flag = false;
        var tags;
        index = 0;
        var tt = false;
        function fadeIn(name) {
            $("#" + name).css('display', '');
        }
        function fadeOut(name) {
            $("#" + name).css('display', 'none');
        }
        $(".dropdownMenu1Item").click(function () {
            $("#dropdownMenu1").html($(this).text() + "<span class=\"caret\"></span>");
            category = $(this).text();
            $("#comfirm-category").text(category);
        });
        $(".dropdownMenu2Item").click(function () {
            tt = true;
            $("#dropdownMenu2").html($(this).text() + "<span class=\"caret\"></span>");
        });
        $("#newcategory-btn").click(function () {
            $(this).css("display", "none");
            fadeOut("dropdownMenu1");
            fadeIn("addcategory-btn");
            fadeIn("inputcategory");
            fadeIn("cancelcategory-btn");
        });
        $("#addcategory-btn").click(function () {
            fadeOut("addcategory-btn");
            fadeOut("inputcategory");
            fadeOut("cancelcategory-btn");
            var tflag = false;
            $(".dropdownMenu1Item").each(function (item) {
                if ($("#inputcategory").val() === $(this).text()) {
                    tflag = true
                }
            });
            if (tflag) {
                toastr.error('Category exits!');
            } else if ($("#inputcategory").val() === "") {
                toastr.error('Empty category!');
            } else {
                $("#dropdownMenu1").html($("#inputcategory").val() + " <span class=\"caret\"></span> ");
                category = $("#inputcategory").val();
                $("#comfirm-category").text(category);
                flag = true;
            }
            fadeIn("dropdownMenu1");
            fadeIn("newcategory-btn");
        });
        $("#cancelcategory-btn").click(function () {
            fadeOut("addcategory-btn");
            fadeOut("inputcategory");
            fadeOut("cancelcategory-btn");
            fadeIn("dropdownMenu1");
            fadeIn("newcategory-btn");
        });
        $("#add-exit-tag-btn").click(function () {
//            console.log($("#dropdownMenu2").text());
            var tmptag = $("#dropdownMenu2").text();
            if (!tt) {
                toastr.error('You don\'t choose tag');
            } else {
                var tflag = false;
                $(".tag-item").each(function(item) {
                    var a = $("#dropdownMenu2").text();
                    var b = $(this).text();
                    if (a === b.substr(0, b.length - 1)) {
                        tflag = true;
                    }
                });
                if (tflag) {
                    toastr.error('Tag exits!');
                } else if (index < 3) {
                    $first = $("#head");
                    $first.attr('id', '');
                    $first.after("<span flag='old' class=\"label label-default tag-item\" id=\"head\">" +
                        tmptag + "<a class=\"delete-tag\" href=\"javascript:void(0);\" onclick=\"javascript:remove(this);\" style=\"color: black; text-decoration: none;\">&times;</a>" +
                        "</span>");
                    index++;
                } else {
                    toastr.error('At most 3 tags!');
                }
            }

        });
        $("#add-tag-btn").click(function () {
            var tflag = false;
            $(".tag-item").each(function (item) {
                var a = $("#input-tag").val();
                var b = $(this).text();
                if (a === b.substr(0, b.length - 1)) {
                    tflag = true;
                }
            });
            if (tflag) {
                toastr.error('Tag exits!');
            } else if ($("#input-tag").val() === "") {
                toastr.error('Empty tag!');
            } else {
                if (index < 3) {
                    $first = $("#head");
                    $first.attr('id', '');
                    $first.after("<span flag='new' class=\"label label-default tag-item\" id=\"head\">" +
                        $("#input-tag").val() + "<a class=\"delete-tag\" href=\"javascript:void(0);\" onclick=\"javascript:remove(this);\" style=\"color: black; text-decoration: none;\">&times;</a>" +
                        "</span>");
                    index++;
                } else {
                    toastr.error('At most 3 tags!');
                }
            }
        });
        $(".delete-tag").click(function () {
            console.log(123);
        });
        $("#deploy-button").click(function () {
            title = $("#title").val();
            content = $("#content").val();
        });

    })(jQuery);
    function remove(obj) {
        $(obj).parent().prev().attr('id', 'head');
        $(obj).parent("[flag]").remove();
        index--;
    }
</script>
</body>
</html>
