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

//    private static void printDubboConfig(AnnotationConfigApplicationContext context) {
//        // application
//        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);
//        System.out.printf("applicationBean.name = %s \n", applicationConfig.getName());
//
//        // module
////        ModuleConfig moduleConfig = context.getBean("moduleBean", ModuleConfig.class);
////        System.out.printf("moduleBean.name = %s \n", moduleConfig.getName());
//
//        // registry
//        RegistryConfig registryConfig = context.getBean(RegistryConfig.class);
//        System.out.printf("registryConfig.name = %s \n", registryConfig.getAddress());
//
//        // protocol
//        ProtocolConfig protocolConfig = context.getBean(ProtocolConfig.class);
//        System.out.printf("protocolConfig.name = %s \n", protocolConfig.getName());
//        System.out.printf("protocolConfig.port = %s \n", protocolConfig.getPort());
//
//        // monitor
////        MonitorConfig monitorConfig = context.getBean(MonitorConfig.class);
////        System.out.printf("monitorConfig.name = %s \n", monitorConfig.getAddress());
//
//        // provider
////        ProviderConfig providerConfig = context.getBean(ProviderConfig.class);
////        System.out.printf("providerConfig.name = %s \n", providerConfig.getHost());
//
//        // consumer
////        ConsumerConfig consumerConfig = context.getBean(ConsumerConfig.class);
////        System.out.printf("consumerConfig.name = %s \n", consumerConfig.getClient());
//    }
}
