package com.pjb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.pjb.mapper")
public class DatatableDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DatatableDemoApplication.class, args);
    }

}
