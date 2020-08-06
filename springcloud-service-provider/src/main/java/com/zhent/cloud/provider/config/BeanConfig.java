package com.zhent.cloud.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName BeanConfig
 * @Description TODO
 * @Author 田震
 * @Date 2020/8/6
 **/
@Configuration//等价于spring applicationContext.xml配置文件
public class BeanConfig {

    /**
     * @Bean等价于：
     * <bean id = "restTemplate" class = ""></bean>
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}