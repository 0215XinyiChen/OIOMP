package com.hwadee.springboot.service;

import com.github.pagehelper.PageHelper;
import com.hwadee.springboot.entity.Goods;
import com.hwadee.springboot.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    public List<Goods> findAll(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        return goodsMapper.findAll();
    }
}
