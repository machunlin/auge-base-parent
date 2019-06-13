package com.auge.base;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 基础服务启动类。
 *
 * @author machunlin
 * @date 2019/6/6
 */
@EnableDubbo(scanBasePackages = "com.auge.base.api")
@EnableTransactionManagement
@SpringBootApplication
public class BaseService {

    public static void main(String[] args) {
        SpringApplication.run(BaseService.class,args);
    }
}
