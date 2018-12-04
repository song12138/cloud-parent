package me.sxf.microservicebserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceBServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceBServerApplication.class, args);
    }
}
