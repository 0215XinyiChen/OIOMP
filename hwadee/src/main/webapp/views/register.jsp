<%--
  Created by IntelliJ IDEA.
  User: 11587
  Date: 2020/7/4
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
    <script type="text/javascript" src="./js/register.js"></script>
    <link rel="stylesheet" type="text/css" href="./css/login.css">
    <script src="jquery-3.4.1.min.js"></script>
</head>
<body>
<div class="limiter" id="login">
    <div class="container-login100 loginPage">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <span class="login100-form-title p-b-49">用户注册</span>

            <form method="post" action="${pageContext.request.contextPath}/insert">

                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入用户名">
                    <span class="label-input100">用户名</span>
                    <input class="input100" id="UserName" type="text" name="UserName" placeholder="请输入用户名" ref=""/>
                    <span class="focus-input100" data-symbol="&#xf206;"></span>
                </div>
                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入手机号">
                    <span class="label-input100">手机号</span>
                    <input autocomplete="off" class="input100" id="phone" name="phone" placeholder="请输入手机号"
                           type="text"/>
                    <span class="focus-input100" data-symbol="&#xf206;"></span>
                </div>

                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入密码" v-if="ispwd">
                    <span class="label-input100">密码</span>
                    <input class="input100" id="UserPwd" name="UserPwd" placeholder="请输入密码" type="password"/>
                    <span class="focus-input100" data-symbol="&#xf190;"></span>
                </div>
                <div class="wrap-input100 validate-input" data-validate="请再次输入密码" v-if="ispwd">
                    <span class="label-input100">确认密码</span>
                    <input class="input100" id="UserPwd1" name="UserPwd1" placeholder="请再次输入密码" type="password"/>
                    <span class="focus-input100" data-symbol="&#xf190;"></span>
                </div>

                <div class="wrap-input100 validate-input m-b-23" data-validate="请输入验证码">
                    <span class="label-input100">验证码</span>
                    <div class="" style="display: flex;flex-wrap: nowrap;">
                        <input autocomplete="off" class="input100" id="verCode" name="verCode" placeholder="请输入验证码"
                               style="width: 70%;" type="text" maxlength="6"/>
                        <input type="button" id="code" onclick="createCode()" style="width:70px" title='点击更换验证码' />
                        <button type="button" onclick="validate()" class="container-sendData-btn ">验证</button>
                    </div>
                    <span class="focus-input100" data-symbol="&#xf206;"></span>
                </div>

                <div class="text-right p-t-8 p-b-31">
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button onclick="return User_Check();" type="submit" value="注册" class="login100-form-btn">注册
                        </button>
                    </div>
                </div>
            </form>

            <div class="flex-col-c p-t-25">
                <a class="txt2" href="${pageContext.request.contextPath}/login">密码登录</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>


