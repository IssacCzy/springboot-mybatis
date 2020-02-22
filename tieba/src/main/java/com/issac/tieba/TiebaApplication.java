package com.issac.tieba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.issac.tieba.mapper") //扫描的mapper
@SpringBootApplication
public class TiebaApplication {
    public static void main(String[] args) {
        SpringApplication.run(TiebaApplication.class, args);
    }
}
