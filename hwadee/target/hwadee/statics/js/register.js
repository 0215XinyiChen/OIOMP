let yzmCheck = false;

function User_Check() {
    let username = document.getElementById('UserName').value;
    let a = document.getElementById('UserPwd').value;
    let b = document.getElementById('UserPwd1').value;
    if (username == "") {
        alert("用户名为空！");
        return false
    }

    let phone = document.getElementById('phone').value;
    if (!(/^1(3|4|5|6|7|8|9)\d{9}$/.test(phone))) {
        alert("请输入正确的手机号！")
        return false;
    }

    if (a == "") {
        alert(username + "请输入密码");
        return false;
    }
    if (b == "") {
        alert(username + "请确认密码");
        return false;
    }
    if (a !== b) {
        alert("两次密码不一致！");
        return false;
    }
    if (!yzmCheck) {
        alert("请验证！")
        return false;
    }
    // alert(username + "---" + "注册成功");
    return true;
}

var code; //在全局定义验证码

function createCode() {
    code = "";
    var codeLength = 4;//验证码的长度
    var checkCode = document.getElementById("code");
    var random = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');//随机数
    for (var i = 0; i < codeLength; i++) {//循环操作
        var index = Math.floor(Math.random() * 36);//取得随机数的索引（0~35）
        code += random[index];//根据索引取得随机数加到code上
    }
    checkCode.value = code;//把code值赋给验证码
}

//校验验证码
function validate() {
    var inputCode = document.getElementById("verCode").value.toUpperCase(); //取得输入的验证码并转化为大写
    if (inputCode.length <= 0) { //若输入的验证码长度为0
        alert("请输入验证码！"); //则弹出请输入验证码
    } else if (inputCode != code) { //若输入的验证码与产生的验证码不一致时
        alert("验证码输入错误！@_@"); //则弹出验证码输入错误
        createCode();//刷新验证码
        document.getElementById("input").value = "";//清空文本框
    } else { //输入正确时
        alert("验证成功");
        yzmCheck = true;
    }
}