package com.laivie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class MicreaoserviceDicoveryEurekaProvider02Application {

        public static void main (String[]args){
            SpringApplication.run(MicreaoserviceDicoveryEurekaProvider02Application.class, args);
        }

}
