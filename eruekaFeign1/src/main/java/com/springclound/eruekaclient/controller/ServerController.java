package com.springclound.eruekaclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {
    @Autowired
    FeignClientDemo feignClientDemo;

    @RequestMapping("/demo")
    public String get(){
        return feignClientDemo.get();
    }
}
