package com.tantan.dubbo.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * dubbo服务提供者启动类
 * @author 谭昙
 * @version 1.0.0
 * @create 2018-03-29 16:20
 * @since JDK 1.7.0_79
 */
@SpringBootApplication
public class DubboProviderDemo {

    public static void main(String[] args){
        SpringApplication.run(DubboProviderDemo.class,args);
    }

}
