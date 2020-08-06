package com.zhent.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName WebController
 * @Description TODO
 * @Author 田震
 * @Date 2020/8/6
 **/
@RestController
public class WebController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello(){
        //逻辑判断代码省略

        //调用SpringCloud服务提供者提供的服务
        return restTemplate.getForEntity("http://localhost:8080/service/hello",String.class).getBody();
    }
}