package com.tantan.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tantan.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谭昙
 * @version 1.0.0
 * @create 2018-03-29 16:27
 * @since JDK 1.7.0_79
 */
@RestController
public class DemoConsumerController {


    @Reference(version = "1.0.0",application = "${dubbo.application.id}",url = "dubbo://localhost:12345")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return demoService.sayHello(name);
    }

}
