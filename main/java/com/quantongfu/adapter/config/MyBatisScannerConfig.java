package com.quantongfu.adapter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;


/**
 * Created by zhaofang on 2018/8/14.
 * dao扫描器
 */
@Configuration
public class MyBatisScannerConfig {

    @Bean
    public MapperScannerConfigurer MapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.quantongfu.adapter.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        System.out.println("=================="+mapperScannerConfigurer.toString());

        return mapperScannerConfigurer;
    }
}
