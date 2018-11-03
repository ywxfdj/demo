package com.silence.spring.cloud.feign.hystrix;

import com.silence.spring.cloud.feign.service.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements FeignInterface {

    public String getInfo() {

        return "Get Info Error!Hystrix!";

    }

}
