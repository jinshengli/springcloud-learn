package com.ljs.eurekasecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekasecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekasecurityApplication.class, args);
    }

}
