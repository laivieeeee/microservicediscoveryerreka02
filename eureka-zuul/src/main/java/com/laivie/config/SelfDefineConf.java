package com.laivie.config;

import com.laivie.filter.SelfDefineFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfDefineConf {
    @Bean
    public SelfDefineFilter getFilter(){
        return new SelfDefineFilter();
    }
}
