package com.exa.salarysys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/注册")
public class Greeting {
    @GetMapping
    public String 注册() {
        return "注册测试";

    }

}