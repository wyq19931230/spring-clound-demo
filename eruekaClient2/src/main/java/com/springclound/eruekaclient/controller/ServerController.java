package com.springclound.eruekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(){
        return "client1";
    }
}
