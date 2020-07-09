package com.hwadee.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("edao")
public class EmpDAOExt implements IEmpDAO {
    public EmpDAOExt(){
        System.out.println(this+"正在创建（升级版)");
    }
    public void create() {
        System.out.println(this+":升级版员工创建成功！");
    }
}
