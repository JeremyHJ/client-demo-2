package com.jeremy.client_demo_2.controller;/**
 Created by 胡杰 on 2019/3/1. */

import com.jeremy.eureka_common.service.feign.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: com.jeremy.client_demo_2.controller.TestController.java
 * Author: Jeremy_HU
 * Date: 2019/3/1 下午9:50
 */

@RequestMapping(value = "/client2")
@RestController
public class TestController {

    @Autowired
    TestFeignService testFeignService;

    @RequestMapping(value = "/demo")
    @ResponseBody
    public String test() {
        System.out.println(testFeignService.innerTest());
        return testFeignService.innerTest();
    }

}
