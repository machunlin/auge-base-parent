package com.auge.base.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author machunlin
 * @date 2019/6/6
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.auge.base")
@EnableDubboConfig //启用外部化配置
@PropertySource("classpath:/dubbo-provider.properties")
public class DubboConfig {

//    /**
//     * 当前应用配置
//     * <dubbo:application name="augo-base-service-provider"/>
//     */
//    @Bean("applicationBean")
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("augo-base-service-provider");
//        return applicationConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     * <dubbo:registry id="my-registry" address="N/A"/>
//     */
//    @Bean("registryConfig")
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("N/A");
//        //registryConfig.setAddress("multicast://224.5.6.7:1234");
//        return registryConfig;
//    }
//
//    /**
//     * 当前连接注册中心配置
//     * <dubbo:protocol name="dubbo" port="12345"/>
//     */
//    @Bean("protocolConfig")
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(12345);
//        return protocolConfig;
//    }


}
