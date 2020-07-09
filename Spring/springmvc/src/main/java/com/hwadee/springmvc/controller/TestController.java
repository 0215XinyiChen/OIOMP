package com.hwadee.springmvc.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {
//    @GetMapping("/test")
//    @ResponseBody //表示直接返回HTML，送到浏览器
//    public String test(){
//        return "SUCCESS!";
//    }
//
//    @PostMapping("/login")
//    @ResponseBody
//    public String loginTest(String username, String password, @DateTimeFormat(pattern = "yyyy-M-d") Date birthdate){
//        return "前端数据"
//                +"<br/>用户名："+username
//                +"<br/>密码：" + password
//                +"<br/>出生日期" + birthdate;
//    }
    @GetMapping("/freemarker")
    public ModelAndView freemarkerTest(){
        ModelAndView mav = new ModelAndView("/test");
        mav.addObject("testString","Freemarker测试成功！");
        return mav;
    }
}

