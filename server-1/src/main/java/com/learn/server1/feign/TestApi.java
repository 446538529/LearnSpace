package com.learn.server1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignClient 自带负载均衡
 */
@FeignClient(value = "client-1")
public interface TestApi {
    @GetMapping("/port")
    String sayPort();
}
