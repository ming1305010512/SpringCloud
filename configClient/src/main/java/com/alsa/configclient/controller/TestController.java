package com.alsa.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2021/11/19
 * @Time:10:39
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${message}")
    private String message;

    @GetMapping("message")
    public String getMessage() {
        return this.message;
    }
}
