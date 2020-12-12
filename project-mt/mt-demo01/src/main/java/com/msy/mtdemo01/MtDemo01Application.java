package com.msy.mtdemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MtDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(MtDemo01Application.class, args);
    }

}
