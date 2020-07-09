package com.hwadee.spring.dao;

import org.springframework.stereotype.Repository;
//等效于 XML 文件中的<bean id="edao" class="...EmpDAO"/>
//@Repository("edao")
public class EmpDAO implements IEmpDAO {
    public EmpDAO(){
        System.out.println(this+"正在初始化");
    }
    public void create() {
        System.out.println(this + ":员工创建成功");
    }
}
