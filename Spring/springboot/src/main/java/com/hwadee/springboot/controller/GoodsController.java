package com.hwadee.springboot.controller;

import com.github.pagehelper.PageInfo;
import com.hwadee.springboot.entity.Goods;
import com.hwadee.springboot.model.LayuiPageInfo;
import com.hwadee.springboot.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;

    /*
    *分页获取所有商品
    * page 页码
    * limit 页尺寸
     */


    @GetMapping("/list")
        //Spring boot控制器方法的参数自动与表单提交的参数匹配
        //当前表单字段名与方法的参数名一致时@Param可以不用
    LayuiPageInfo findAll(Integer page,Integer limit){
        List<Goods> datas = goodsService.findAll(page, limit);
        //使用PageHelper的分页功能获取的分页信息，以下语句与上一条之间不能有其他数据库操作
        PageInfo<Goods> pageInfo = new PageInfo<Goods>(datas);
        //创建返回到客户端的数据模型
        LayuiPageInfo result = new LayuiPageInfo();
        result.setCode(0); //表示正确
        result.setMsg(""); //错误信息
        result.setData(datas); //指定页的数据
        result.setCount(pageInfo.getTotal()); //记录总数
        return result;
    }

}
