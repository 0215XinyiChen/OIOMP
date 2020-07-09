package com.hwadee.mybatis;

import com.hwadee.mybatis.entity.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyBatisTest {
    static SqlSessionFactory sqlSessionFactory = null;

    @BeforeClass //在所有测江用的开始之前执行一次规始化工作
    public static void init() throws IOException {
        //获取resources下的资源文件的文件流
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        //使用指定配置文件创建sqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    SqlSession session = null;
    @Before //在每个测试用例执行之前调用
    public void openSession() {
        try {
            session = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After //在每个测试用例执行之后执行
    public void closeSession() {
        if (session == null) return;
        session.rollback(); //回滚失败的操作
        session.close(); //归还连接到连接池
        session = null;
    }

    @Test
    public void testSessionFactor() throws IOException, SQLException {
        Connection connection = session.getConnection(); //从连接池获取一个连接
        System.out.println(connection);
        connection.close(); //归还连接
    }

    @Test
    public void testFindAll() {
        List<Goods> list = session.selectList("goods.findAll");
        Goods goods = list.get(0);
        System.out.println(goods.getTitle());
    }
}
