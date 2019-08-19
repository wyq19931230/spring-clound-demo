package com.springclound.eruekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class eruekaClient {
    public static void main(String[] args) {
        SpringApplication.run(eruekaClient.class,args);
    }
}
