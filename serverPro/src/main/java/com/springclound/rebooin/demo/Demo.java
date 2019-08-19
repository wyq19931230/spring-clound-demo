package com.springclound.rebooin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/reb")
public class Demo {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/demo")
    public String get(){
        String s = (String)restTemplate.getForObject("http://eruekaclient1/server/get",String.class);
        return s;
    }
}
