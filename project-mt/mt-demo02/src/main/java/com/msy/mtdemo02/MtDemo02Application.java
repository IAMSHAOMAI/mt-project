package com.msy.mtdemo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MtDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(MtDemo02Application.class, args);
    }

}
