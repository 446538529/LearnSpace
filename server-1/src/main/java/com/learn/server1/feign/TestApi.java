package com.learn.server1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client-1")
public interface TestApi {
    @GetMapping("/port")
    String sayPort();
}
