package me.sxf.microserviceaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("who")
    public String who() {
        return "I am MicroServiceA";
    }
}
