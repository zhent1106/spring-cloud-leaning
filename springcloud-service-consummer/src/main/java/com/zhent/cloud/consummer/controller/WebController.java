package com.zhent.cloud.consummer.controller;

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
    private RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello(){
        return restTemplate.getForEntity("http://SPRINGCLOUD-SERVICE-PROVIDER/service/hello",String.class).getBody();
    }
}