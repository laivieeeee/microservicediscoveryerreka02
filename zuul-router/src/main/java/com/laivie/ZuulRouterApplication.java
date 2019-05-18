package com.laivie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulRouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulRouterApplication.class, args);
    }

}
