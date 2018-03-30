package com.tantan.dubbo.redis.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.tantan.dubbo.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author 谭昙
 * @version 1.0.0
 * @create 2018-03-29 16:11
 * @since JDK 1.7.0_79
 */
@Slf4j
@Service
@SpringBootApplication
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        log.info("redis dubbo sayHello:"+name);
        return "redis dubbo sayHello:"+name;
    }

    public static void main(String[] args){
        SpringApplication.run(DemoServiceImpl.class,args);
    }

}
