package com.hezhu.heojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hezhu.heojbackendquestionservice.mapper")
@ComponentScan("com.hezhu")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hezhu.heojbackendserviceclient.service"})
public class HeojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeojBackendQuestionServiceApplication.class, args);
    }

}
