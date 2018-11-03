package com.silence.spring.cloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.silence.spring.cloud.feign.hystrix.FeignHystrix;

@FeignClient(value = "provider", fallback = FeignHystrix.class)
public interface FeignInterface {

    @RequestMapping("/getInfo")
    public String getInfo();

}

