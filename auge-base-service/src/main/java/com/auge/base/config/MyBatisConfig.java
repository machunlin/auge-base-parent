//package com.auge.base.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
///**
// * @author machunlin
// * @date 2019/6/9
// */
//@Configuration
//@MapperScan("com.auge.base.mapper")
//@ComponentScan("com.auge.base.service")
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class MyBatisConfig {
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
//
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
//
