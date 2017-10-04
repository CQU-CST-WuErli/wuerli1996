<%--
  Created by CQU-CST-WuErli
  Date: 2017/9/19
  Time: 0:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>

    <!--- basic page needs
    ================================================== -->
    <meta charset="utf-8">
    <title>Whisper</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- mobile specific metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- CSS
  ================================================== -->
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/vendor.css">
    <link rel="stylesheet" href="css/iconfont/iconfont.css">
    <%--<link rel="stylesheet" href="css/bootstrap.min.css">--%>

    <!-- script
    ================================================== -->
    <script src="js/modernizr.js"></script>
    <script src="js/pace.min.js"></script>
    <%--<script src="js/bootstrap.min.js"></script>--%>

    <!-- favicons
     ================================================== -->
    <link rel="icon" type="image/png" href="images/favicon-1.ico">

</head>

<body id="top">

<!-- header
================================================== -->
<header>
    <div class="row">

        <div class="top-bar">
            <a class="menu-toggle" href="#"><span>Menu</span></a>

            <div class="logo">
                <a href="javascript:void(0);" onclick="jQuery('.menu-toggle').click()">WHISPER</a>
            </div>

            <nav id="main-nav-wrap">
                <ul class="main-navigation">
                    <li class="current"><a class="smoothscroll"  href="#intro" title="">Home</a></li>
                    <li><a class="smoothscroll"  href="#about" title="">About</a></li>
                    <%--<li><a class="smoothscroll"  href="#resume" title="">Resume</a></li>--%>
                    <%--<li><a class="smoothscrol#l"  href="#portfolio" title="">Portfolio</a></li>--%>
                    <%--<li><a class="smoothscroll"  href="#services" title="">Services</a></li>--%>
                    <li><a class="smoothscroll"  href="#contact" title="">Contact</a></li>
                    <li><a href="blog" title="">My Blog</a></li>
                </ul>
            </nav>
        </div> <!-- /top-bar -->

    </div> <!-- /row -->
</header> <!-- /header -->

<!-- intro section
================================================== -->
<section id="intro">

    <div class="intro-overlay"></div>

    <div class="intro-content">
        <div class="row">

            <div class="col-twelve">

                <h5>Hello, World.</h5>
                <h1>I'm Wu Erli.</h1>

                <p class="intro-position">
                    <span>Quasi Master Degree Candidate</span>
                    <span>Arcade Game Enthusiasts</span>
                </p>

                <a class="button stroke smoothscroll" href="#about" title="">More About Me</a>

            </div>

        </div>
    </div> <!-- /intro-content -->

    <ul class="intro-social">
        <li><a href="javascript:void(0);"  class="nouseicon"><i class="iconfont icon-qq"></i></a></li>
        <li><a href="https://github.com/CQU-CST-WuErli" target="_blank"><i class="iconfont icon-github"></i></a></li>
        <li><a href="http://blog.csdn.net/cquwel" target="_blank"><i class="iconfont icon-csdn"></i></a></li>
        <li><a href="javascript:void(0);"  class="nouseicon"><i class="iconfont icon-xinlangweibo"></i></a></li>
    </ul> <!-- /intro-social -->

</section> <!-- /intro -->


<!-- about section
================================================== -->
<section id="about">

    <div class="row section-intro">
        <div class="col-twelve">

            <h5>About</h5>
            <h1>Let me introduce myself.</h1>

            <div class="intro-info">

                <img src="images/personal.png" alt="Profile Picture">

                <p class="lead">
                    I want to be a technical nerd but not skillful enough(sad). I have an interest in
                    funny and interesting technology. An arcade game fan especially in kov. I hope someone
                    who has the same interests can contact me.
                </p>
            </div>

        </div>
    </div> <!-- /section-intro -->

    <div class="row about-content">

        <div class="col-six tab-full">

            <h3>Profile</h3>
            <p>
                ChongQing University : Computer Science and Technology.<br>
                SouthEast University : Data mining.
            </p>

            <ul class="info-list">
                <li>
                    <strong>Fullname:</strong>
                    <span>Wu Erli</span>
                </li>
                <li>
                    <strong>Birth Date:</strong>
                    <span>September 23, 1996</span>
                </li>
                <li>
                    <strong>Job:</strong>
                    <span>Student</span>
                </li>
                <li>
                    <strong>Website:</strong>
                    <span>www.wuerli1996.cn</span>
                </li>
                <li>
                    <strong>Email:</strong>
                    <span>wuerli1996@163.com</span>
                </li>

            </ul> <!-- /info-list -->

        </div>

        <div class="col-six tab-full">

            <h3>Skills</h3>
            <p>
                Tried many things but not deep enough. <br>
                Try my best to be full stack.<br>
                <br>
            </p>
            <ul class="skill-bars">
                <li>
                    <div class="progress percent50"><span>50%</span></div>
                    <strong>C++</strong>
                </li>
                <li>
                    <div class="progress percent50"><span>50%</span></div>
                    <strong>JAVA</strong>
                </li>
                <li>
                    <div class="progress percent40"><span>40%</span></div>
                    <strong>PHP</strong>
                </li>
                <li>
                    <div class="progress percent25"><span>25%</span></div>
                    <strong>ALGORITHM</strong>
                </li>
                <li>

                    <div class="progress percent5"><span>5%</span></div>
                    <strong>DATA MINING</strong>
                </li>

            </ul> <!-- /skill-bars -->

        </div>

    </div>

    <div class="row button-section">
        <div class="col-twelve">
            <a href="#contact" title="Contact Me" class="button stroke smoothscroll">Contact Me</a>
            <a href="javascript:void(0);" title="Download CV" class="button button-primary nohire">Download CV</a>
        </div>
    </div>

</section> <!-- /process-->

<!-- contact
================================================== -->
<section id="contact">

    <div class="row section-intro">
        <div class="col-twelve">

            <h5>Contact</h5>
            <h1>I'd Love To Hear From You.</h1>

        </div>
    </div> <!-- /section-intro -->

    <div class="row contact-form">

        <div class="col-twelve">

            <!-- form -->
            <form name="contactForm" id="contactForm">
                <fieldset>
                    <div class="form-field">
                        <input name="name" type="text" id="contactName" placeholder="Name" value="" minlength="2" required="">
                    </div>
                    <div class="form-field">
                        <input name="email" type="email" id="contactEmail" placeholder="Email" value="" required="">
                    </div>
                    <div class="form-field">
                        <input name="subject" type="text" id="contactSubject" placeholder="Subject" value="">
                    </div>
                    <div class="form-field">
                        <textarea name="message" id="contactMessage" placeholder="message" rows="10" cols="50" required=""></textarea>
                    </div>
                    <div class="form-field">
                        <button class="submitform" type="button">Submit</button>
                        <div id="submit-loader">
                            <div class="text-loader">Sending...</div>
                            <div class="s-loader">
                                <div class="bounce1"></div>
                                <div class="bounce2"></div>
                                <div class="bounce3"></div>
                            </div>
                        </div>
                    </div>
                </fieldset>
            </form> <!-- Form End -->

            <!-- contact-warning -->
            <div id="message-warning">
            </div>
            <!-- contact-success -->
            <div id="message-success">
                <i class="fa fa-check"></i>Your message was sent, thank you!<br>
            </div>
        </div> <!-- /col-twelve -->
    </div> <!-- /contact-form -->

    <div class="row contact-info">
        <div class="col-four tab-full">
            <div class="icon">
                <i class="icon-pin"></i>
            </div>
            <h5>Where to find me</h5>
            <p>
                ChongQing<br>
                Shapingba District<br>
                CHongQIng University Campus A
            </p>
        </div>

        <div class="col-four tab-full collapse">

            <div class="icon">
                <i class="icon-mail"></i>
            </div>

            <h5>Email Me At</h5>

            <p>wuerli1996@163.com
            </p>

        </div>

        <div class="col-four tab-full">

            <div class="icon">
                <i class="icon-phone"></i>
            </div>

            <h5>Call Me At</h5>

            <p>
                Sorry for privacy.
            </p>

        </div>

    </div> <!-- /contact-info -->

</section> <!-- /contact -->


<!-- footer
================================================== -->

<footer id="footer" class="row">
    <div class="footer-content page">
        <div class="col f1" style="width: 100%;text-align: center">
            <p>Copyright ©2017 WuErli. All rights reserved.</p>
        </div>
    </div>
</footer>

<%--<footer>--%>
    <%--<div class="row">--%>

        <%--<div class="col-six tab-full pull-right social">--%>

            <%--<ul class="footer-social">--%>
                <%--<li><a href="#"><i class="fa fa-facebook"></i></a></li>--%>
                <%--<li><a href="#"><i class="fa fa-behance"></i></a></li>--%>
                <%--<li><a href="#"><i class="fa fa-twitter"></i></a></li>--%>
                <%--<li><a href="#"><i class="fa fa-dribbble"></i></a></li>--%>
                <%--<li><a href="#"><i class="fa fa-instagram"></i></a></li>--%>
            <%--</ul>--%>

        <%--</div>--%>

        <%--<div class="col-six tab-full">--%>
            <%--<div class="copyright">--%>
                <%--<span>© Copyright Kards 2016.</span>--%>
                <%--<span>More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></span>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--<div id="go-top">--%>
            <%--<a class="smoothscroll" title="Back to Top" href="#top"><i class="fa fa-long-arrow-up"></i></a>--%>
        <%--</div>--%>

    <%--</div> <!-- /row -->--%>
<%--</footer>--%>

<div id="preloader">
    <div id="loader"></div>
</div>

<!-- Java Script
================================================== -->
<script src="js/jquery-2.1.3.min.js"></script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>

</body>

</html>