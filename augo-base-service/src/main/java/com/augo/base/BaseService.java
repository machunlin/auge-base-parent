package com.augo.base;

import com.augo.base.config.DubboConfig;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.SimpleTransactionStatus;

/**
 * 基础服务启动类。
 *
 * @author machunlin
 * @date 2019/6/6
 */
@EnableTransactionManagement // 激活事务管理
public class BaseService {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();

        printDubboConfig(context);

        System.in.read();
    }

    private static void printDubboConfig(AnnotationConfigApplicationContext context) {
        // application
        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);
        System.out.printf("applicationBean.name = %s \n", applicationConfig.getName());

        // module
//        ModuleConfig moduleConfig = context.getBean("moduleBean", ModuleConfig.class);
//        System.out.printf("moduleBean.name = %s \n", moduleConfig.getName());

        // registry
        RegistryConfig registryConfig = context.getBean(RegistryConfig.class);
        System.out.printf("registryConfig.name = %s \n", registryConfig.getAddress());

        // protocol
        ProtocolConfig protocolConfig = context.getBean(ProtocolConfig.class);
        System.out.printf("protocolConfig.name = %s \n", protocolConfig.getName());
        System.out.printf("protocolConfig.port = %s \n", protocolConfig.getPort());

        // monitor
//        MonitorConfig monitorConfig = context.getBean(MonitorConfig.class);
//        System.out.printf("monitorConfig.name = %s \n", monitorConfig.getAddress());

        // provider
//        ProviderConfig providerConfig = context.getBean(ProviderConfig.class);
//        System.out.printf("providerConfig.name = %s \n", providerConfig.getHost());

        // consumer
//        ConsumerConfig consumerConfig = context.getBean(ConsumerConfig.class);
//        System.out.printf("consumerConfig.name = %s \n", consumerConfig.getClient());
    }

    /**
     * 自定义事务管理器
     */
    @Bean
    @Primary
    public PlatformTransactionManager transactionManager() {
        return new PlatformTransactionManager() {

            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                System.out.println("get transaction ...");
                return new SimpleTransactionStatus();
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                System.out.println("commit transaction ...");
            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {
                System.out.println("rollback transaction ...");
            }
        };
    }
}
