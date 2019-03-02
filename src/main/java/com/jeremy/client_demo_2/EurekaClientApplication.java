package com.jeremy.client_demo_2;/**
 Created by 胡杰 on 2019/3/1. */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * FileName: com.jeremy.client_demo_2.EurekaClientApplication.java
 * Author: Jeremy_HU
 * Date: 2019/3/1 下午9:24
 */

@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.jeremy.eureka_common")
@ComponentScan(basePackages = "com.jeremy.client_demo_2")
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String args[]){
        SpringApplication.run(EurekaClientApplication.class,args);
    }

}
