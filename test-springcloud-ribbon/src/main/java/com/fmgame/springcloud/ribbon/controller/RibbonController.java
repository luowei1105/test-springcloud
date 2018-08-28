package com.fmgame.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author luowei
 * @date 2018年8月21日 上午11:17:06
 */
@RestController
public class RibbonController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "helloError")
	public String hello() {
		return restTemplate.getForEntity("http://SERVICE-PROVIDER/hello?name=ribbon", String.class).getBody();
	}
	
	public String helloError() {
		return "hello ribbon, sorry error!";
	}
	
}
