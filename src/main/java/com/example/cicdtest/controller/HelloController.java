package com.example.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hifun01@outlook.com
 * @Date 2025/7/11 00:54
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello CICD";
    }
}
