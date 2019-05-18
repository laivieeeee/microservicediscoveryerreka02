package com.laivie.config;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用注解标记一个被配置用在负载均衡客户端上的RestTemplate Bean
 */
@Qualifier
public interface MyLoadBalanced {

}
