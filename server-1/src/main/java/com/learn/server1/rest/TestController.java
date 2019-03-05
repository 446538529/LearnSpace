package com.learn.server1.rest;

import com.learn.server1.feign.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestApi testApi;

    @GetMapping("/testFeign")
    public String testFeign(){
        return testApi.sayPort();
    }
}
