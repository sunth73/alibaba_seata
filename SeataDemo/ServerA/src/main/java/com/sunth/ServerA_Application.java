package com.sunth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Sunth
 * @DateTime 2019-10-12 14:21
 * 描述
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerA_Application {
    public static void main(String[] args) {
        SpringApplication.run(ServerA_Application.class,args);
    }
}
