package com.laivie.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConf {
    //配置访问"module/**"的项目，都转发到"eureka-module/**"进行处理
    @Bean
    public PatternServiceRouteMapper patternServiceRouteMapper(){
        return new PatternServiceRouteMapper(
                "(eureka)-(?<module>.+)", "${module}/**");
    }
}
