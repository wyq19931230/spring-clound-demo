package com.springclound.eruekaclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eruekaclient1")
public interface FeignClientDemo {

    @RequestMapping("/server/get")
    public String get();
}
