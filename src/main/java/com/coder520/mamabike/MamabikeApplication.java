package com.coder520.mamabike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Map;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MamabikeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MamabikeApplication.class, args);
    }



}

