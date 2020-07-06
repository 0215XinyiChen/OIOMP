
<%--
  Created by IntelliJ IDEA.
  User: 11587
  Date: 2020/7/4
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <script type="text/javascript" src="./js/login.js"></script>
    <link rel="stylesheet" type="text/css" href="./css/login.css">

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body style="overflow: hidden">

${error}
<div class="limiter" id="login">
    <div class="container-login100 loginPage">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <span class="login100-form-title p-b-49">用户登录</span>

            <form action="<c:url value="/login"/>" method="post">

                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入手机号">
                    <span class="label-input100">手机号</span>
                    <input class="input100" id="username" type="text" name="username" placeholder="请输入手机号" ref=""/>
                    <span class="focus-input100" data-symbol="&#xf190;"></span>

                </div>
                <div class="wrap-input100 validate-input" data-validate="请输入密码" v-if="ispwd">
                    <span class="label-input100">密码</span>
                    <input class="input100"  id="password" name="password" placeholder="请输入密码" type="password" />
                    <span class="focus-input100" data-symbol="&#xf190;"></span>
                </div>

                <div class="text-right p-t-8 p-b-31">
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button onclick="return Login_Check();" type="submit" value="登录"  class="login100-form-btn">登录</button>
                    </div>
                </div>
            </form>

            <div class="flex-col-c p-t-25">
                <a class="txt2" href="${pageContext.request.contextPath}/insertPage" >立即注册</a>
            </div>

        </div>
    </div>
</div>
</div>
</body>
</html>
