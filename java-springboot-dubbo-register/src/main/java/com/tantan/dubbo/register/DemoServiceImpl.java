package com.tantan.dubbo.register;

import com.alibaba.dubbo.config.annotation.Service;
import com.tantan.dubbo.api.DemoService;
import lombok.extern.slf4j.Slf4j;



/**
 * @author 谭昙
 * @version 1.0.0
 * @create 2018-03-29 16:11
 * @since JDK 1.7.0_79
 */
@Slf4j
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        log.info("springboot dubbo sayHello:"+name);
        return "springboot dubbo sayHello:"+name;
    }
}
