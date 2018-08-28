package com.fmgame.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luowei
 * @date 2018年8月24日 下午8:50:42
 */
@RefreshScope
@RestController
public class HelloController {
	
    @Value("${test.nickname}")
    private String nickname;
    
    @Autowired
    private Environment env;

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello " + nickname;
    }
    
    @RequestMapping("/hello2")
    public String hello2() {
        return env.getProperty("test.nickname", "undefined");
    }
    
}
