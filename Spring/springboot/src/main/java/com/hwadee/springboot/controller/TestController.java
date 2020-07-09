package com.hwadee.springboot.controller;

import com.hwadee.springboot.entity.Goods;
import com.hwadee.springboot.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "<h1>Hello world!</h1>";
    }

//    @Resource
//    GoodsService goodsService;
//
//    @GetMapping("/goods")
////    public List<Goods> getGoods(){
////        return goodsService.findAll();
////    }

}
