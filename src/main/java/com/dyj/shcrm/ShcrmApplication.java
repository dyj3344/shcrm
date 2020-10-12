package com.dyj.shcrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
//exclude = {DataSourceAutoConfiguration.class}
public class ShcrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShcrmApplication.class, args);
    }

}
