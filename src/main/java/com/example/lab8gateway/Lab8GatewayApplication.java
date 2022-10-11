package com.example.lab8gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab8GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab8GatewayApplication.class, args);
    }

}
