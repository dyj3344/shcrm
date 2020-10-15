package com.dyj.shcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//exclude = {DataSourceAutoConfiguration.class}
//@ComponentScan(basePackages = "com.dyj.shcrm")
@MapperScan(basePackages = "com.dyj.shcrm.mapper")
public class ShcrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShcrmApplication.class, args);
    }

}
