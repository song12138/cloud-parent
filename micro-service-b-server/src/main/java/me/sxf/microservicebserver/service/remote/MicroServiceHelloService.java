package me.sxf.microservicebserver.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservicea")
public interface MicroServiceHelloService {
    /**
     * 代理MicroserviceA
     */
    @GetMapping("who")
    public String who();
}
