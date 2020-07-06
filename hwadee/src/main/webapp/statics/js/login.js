function Login_Check() {
    let username = document.getElementById('UserName').value;
    let a = document.getElementById('UserPwd').value;
    if (username == "") {
        alert("用户名为空！");
        return false
    }
    if (a == "") {
        alert("请输入密码");
        return false;
    }
    // alert(username + "--" + a + "登陆成功");
    return true;
}