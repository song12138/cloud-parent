package me.sxf.regcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegCenterServerApplication.class, args);
    }
}
