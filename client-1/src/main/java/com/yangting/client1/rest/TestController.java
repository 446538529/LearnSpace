package com.yangting.client1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private Integer port;
    @GetMapping("/port")
    public String sayPort(){
        return "port:"+port;
    }

}
