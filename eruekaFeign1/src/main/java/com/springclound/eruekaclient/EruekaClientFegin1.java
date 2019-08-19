package com.springclound.eruekaclient;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootConfiguration
public class EruekaClientFegin1 {
    public static void main(String[] args) {
        SpringApplication.run(EruekaClientFegin1.class,args);
    }

    @Bean
    @LoadBalanced
    public IRule iRule(){
        return  new RandomRule();
    }
}
