package com.hwadee.spring.service;

import com.hwadee.spring.dao.IEmpDAO;

public class HrService {
    IEmpDAO empDAO = null;
    public HrService(){
        System.out.println(this+"初始化成功！");
    }
    public void entry(){
        System.out.println(this+"entry()方法调用开始");
        empDAO.create();
        System.out.println(this+"entry()方法调用结束");
    }
    public void setEmpDAO(IEmpDAO empDAO) {
        System.out.println("调用 setEmpDAO" + empDAO);
        this.empDAO = empDAO;
    }
}
