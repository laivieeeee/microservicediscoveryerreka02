package com.laivie.micreoservicedicoveryeurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class MicreoserviceDicoveryEurekaServer02Application {

    public static void main(String[] args) {
        //@SuppressWarnings("resource")
        //Scanner scan = new Scanner(System.in);
        //String profiles = scan.nextLine();
        //new SpringApplicationBuilder(MicreoserviceDicoveryEurekaServer02Application.class).profiles(profiles).run(args);
        SpringApplication.run(MicreoserviceDicoveryEurekaServer02Application.class, args);
    }

}
