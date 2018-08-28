package com.fmgame.springcloud.feign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luowei
 * @date 2018年8月21日 下午8:55:21
 */
@FeignClient(value = "service-provider", fallback = ServiceProviderByHystric.class)
public interface ServiceProvider {
	
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
    
}
