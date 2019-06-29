package com.lh.config;

import com.lh.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huanliu7
 * @describe Configuration:组件
 * @date 2019/6/29 18:31
 */

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService02(){
        System.out.println("添加组件成功");
        return new HelloService();
    }
}
