package com.jzh.springbootjzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jzh.springbootjzh.mapper")
public class SpringbootJzhApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJzhApplication.class, args);
    }

}
