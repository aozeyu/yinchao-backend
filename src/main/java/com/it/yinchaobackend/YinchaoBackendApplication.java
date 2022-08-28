package com.it.yinchaobackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.it.yinchaobackend.dao")
public class YinchaoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YinchaoBackendApplication.class, args);
    }

}
