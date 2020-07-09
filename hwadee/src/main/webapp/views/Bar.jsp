<%--
  Created by IntelliJ IDEA.
  User: 11587
  Date: 2020/7/9
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>CSS3二级下拉动画菜单 菜单背景滑动动画DEMO演示</title>
    <link rel="stylesheet" href="./css/Menu-Bar/style.css" media="screen" type="text/css"/>
</head>

<body>

<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
<div class="sidebar">
    <h1><i class="fa fa-bars push"></i>Animated <span class="color">Menu</span></h1>
    <ul>

        <!--说明：每一个<li>代表一个侧边栏，每一个<li>也可以包含多个<li>代表二级侧边栏-->
        <!--第一个-->
        <li>
            <a href="/views/test.html">
                <i class="fa fa-dashboard push"></i>测试1<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
        </li>

        <!--第二个-->
        <li>
            <a href="#">
                <i class="fa fa-user push"></i>测试2<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
            <ul class="sub-menu">
                <li><a href="#">测试2.1<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
                <li><a href="#">测试2.2<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
            </ul>
        </li>

        <!--第三个-->
        <li>
            <a href="#">
                <i class="fa fa-cog push"></i>测试3<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
            <ul class="sub-menu">
                <li><a href="#">测试3.1<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
                <li><a href="#">测试3.2<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
                <li><a href="#">测试3.3<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
                <li><a href="#">测试3.4<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
            </ul>
        </li>

        <!--第四个-->
        <li>
            <a href="#">
                <i class="fa fa-picture-o push"></i>测试4<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
            <ul class="sub-menu">
                <li><a href="#">测试4.1<i class="fa fa-angle-right"></i></a><span class="hover"></span>
                </li>
                <li><a href="#">测试4.2<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
            </ul>
        </li>

        <!--第五个-->
        <li>
            <a href="#">
                <i class="fa fa-file push"></i>测试5<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
            <ul class="sub-menu">
                <li><a href="#">测试5.1<i class="fa fa-angle-right"></i></a><span class="hover"></span>
                </li>
                <li><a href="#">测试5.2<i class="fa fa-angle-right"></i></a><span class="hover"></span></li>
            </ul>
        </li>

        <!--第六个-->
        <li>
            <a href="#">
                <i class="fa fa-plane push"></i>测试6<i class="fa fa-angle-right"></i>
            </a>
            <span class="hover"></span>
        </li>
    </ul>
</div>
<div style="text-align:center;clear:both">
    <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
    <script src="/follow.js" type="text/javascript"></script>
</div>
<script src='/statics/js/Menu-Bar/jquery.js'></script>

<script src="/statics/js/Menu-Bar/index.js"></script>

</body>

</html>
