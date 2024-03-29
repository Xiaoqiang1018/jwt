package com.xq.cloud.providerdemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemo01Application.class, args);
    }

}
