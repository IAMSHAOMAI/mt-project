package com.msy.mteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MtEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtEurekaApplication.class, args);
    }

}
