package me.sxf.microservicebserver.controller;

import me.sxf.microservicebserver.service.remote.MicroServiceHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MicroServiceHelloService microServiceHelloService;

    @GetMapping("who")
    public String who() {
        return "I am MicroServiceB";
    }

    @GetMapping("whoa")
    public String whoa() {
        return microServiceHelloService.who();
    }

}
