package com.hwadee.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hwadee.springboot.mapper") //告诉mybatis Mapper接口在哪里找
public class Application {
    public static void main(String[] args){
        //自动Spring Boot应用，将控制台参数传递给应用程序
        //类名是SpringApplication，不是SpringBootApplication这是上面的注解名)
        SpringApplication.run(Application.class,args);
    }
}
