package com.gorbatenko.eurikaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurikaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurikaclientApplication.class, args);
    }

}
