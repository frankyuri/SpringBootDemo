package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyappConfig {
    @Bean//將方法的返回值加到容器中，容器中的組件默認ID就是方法名
    public HelloService helloService(){
        System.out.println("配置類給@BEAN給容器中添加組建了");
        return new HelloService();
    }
}
