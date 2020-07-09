package com.hwadee.springmvc.controller;

import com.hwadee.springmvc.entity.User;
import com.hwadee.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource //使用 IDEA 的自动修改功能，加入 Java EE 6 的模块依赖
            UserService userService = null;
    @ResponseBody
    @PostMapping("/reg")
    public User reg(String username){
        User user = userService.regUser(username);
        return user;
    }
}
