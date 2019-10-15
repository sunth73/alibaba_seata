package com.sunth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Sunth
 * @DateTime 2019-10-12 14:39
 * 描述
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ClientA_Application {
    public static void main(String[] args) {
        SpringApplication.run(ClientA_Application.class,args);
    }
}
