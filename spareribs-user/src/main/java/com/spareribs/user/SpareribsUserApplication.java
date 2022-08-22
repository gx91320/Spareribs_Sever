package com.spareribs.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpareribsUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpareribsUserApplication.class, args);
    }

}
