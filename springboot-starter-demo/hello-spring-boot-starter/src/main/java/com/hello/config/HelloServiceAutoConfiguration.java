package com.hello.config;

import com.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author frankq
 * @date 2021/12/6
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    private HelloProperties helloProperties;

    /**
     * 通过构造方法注入的方式配置属性对象的HelloProperties
     */
    public HelloServiceAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    /**
     * 实例化HelloService并且载入 Spring IOC 容器
     */
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService() {
        return new HelloService(helloProperties.getName(), helloProperties.getAddress());
    }

}
