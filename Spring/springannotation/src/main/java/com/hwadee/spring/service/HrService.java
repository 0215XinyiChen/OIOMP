package com.hwadee.spring.service;

import com.hwadee.spring.dao.IEmpDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 格式：@Service("beanId")
// 如果没有写名字，则把类名第一个字母变成小写后作为 beanId
// 如下，其 beanId 为 hrService
@Service
public class HrService {
    public HrService(){
        System.out.println("正在创建："+this);
    }
    // 使用 @Resources 注解属性，不用再为其设置 set 方法
    //1. 设置 name 属性根据 beanID 加载
    //2. 不设置 name 属性，把属性名作为 beanId 加载
    //3. 如果 beanId 不存在，则按类型进行加载 （不推荐使用）
    @Resource(name="edao")
    private IEmpDAO edao = null;
    public void entry(){
        System.out.println("员工入职操作");
        edao.create();
    }
}
