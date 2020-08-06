package com.zhent.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 田震
 * @Date 2020/8/6
 **/
@RestController
public class HelloController {
    @RequestMapping("/service/hello")
    public String hello(){
        //进行业务处理
        return "hello spring cloud";
    }
}