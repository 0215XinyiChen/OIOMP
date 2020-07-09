package com.hwadee.spring.dao;

public class EmpDAO implements IEmpDAO {
    public void create() {
        System.out.println(this + ":员工创建成功！");
    }
}
